var hotels = (function () {

    var fns = {};

    var saveHotel = function (name, nameCN, city, category, type, chain, address, gps) {
        //alert("call");
        //console.log(window.location);
        // console.log(name + "/" + nameCN + "/" + city + "/" + category + "/" + type + "/" + chain + "/" + address + "/" + gps + "/" + rename + "/" + reemail + "/" + saname + "/" + saphone + "/" + gmname + "/" + gmphone);
        return $.ajax({
            url: "/DMC_Management_System/HotelController",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                'name': name,
                'nameCN': nameCN,
                'city': city,
                'category': category,
                'type': type,
                'chain': chain,
                'address': address,
                'gps': gps

            }), error: function (e) {
                alert("Something went wrong !");
            },
            success: function (response) {
                alert("Saved !");
                window.location.reload();
            }
        });
    };

    var saveContact = function (hotelID, name, position, num1, num2, email) {
        
        return $.ajax({
            url: "/DMC_Management_System/ContactController",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify({
                'hotelID': hotelID,
                'name': name,
                'position': position,
                'num1': num1,
                'num2': num2,
                'email': email

            }), error: function (e) {
                alert("Something went wrong !");
            },
            success: function (response) {
                alert("Saved !");
                window.location.reload();
            }
        });
    };

    var deleteHotel = function (id) {

        return $.ajax({
            url: "/DMC_Management_System/HotelController",
            type: "DELETE",
            contentType: "application/json",
            data: JSON.stringify({
                'id': id
            }), error: function (e) {
                alert("Something went wrong !");
            },
            success: function (response) {
                alert("Saved");
                window.location().reload();
            }
        });

    };

    var updateHotel = function (id, name, nameCN, city, category, type, chain, address, gps) {
        //alert("lol");
        console.log(id + "/" + name + "/" + nameCN + "/" + city + "/" + category + "/" + type + "/" + chain + "/" + address + "/" + gps);
        return $.ajax({
            url: "/DMC_Management_System/HotelController",
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify({
                'id': id,
                'name': name,
                'nameCN': nameCN,
                'city': city,
                'category': category,
                'type': type,
                'chain': chain,
                'address': address,
                'gps': gps
            }), error: function (e) {
                //alert("saved");
            },
            success: function (response) {
                //alert("saved");
            }
        });
    };

    fns.init = function () {

        {//validation
            // initialize the validator function
            validator.message.date = 'not a real date';

            // validate a field on "blur" event, a 'select' on 'change' event & a '.reuired' classed multifield on 'keyup':
            $('form')
                    .on('blur', 'input[required], input.optional, select.required', validator.checkField)
                    .on('change', 'select.required', validator.checkField)
                    .on('keypress', 'input[required][pattern]', validator.keypress);

            $('.multi.required').on('keyup blur', 'input', function () {
                validator.checkField.apply($(this).siblings().last()[0]);
            });

            $('form').submit(function (e) {
                e.preventDefault();
                var submit = true;

                // evaluate the form using generic validaing
                if (!validator.checkAll($(this))) {
                    submit = false;
                }

                if (submit) {
                    saveHotel($('#name').val(),
                            $('#nameCN').val(),
                            $('#city').val(),
                            $('#cat').val(),
                            $('#type').val(),
                            $('#chain').val(),
                            $('#address').val(),
                            $('#gps').val());
                }
                return false;
            });
        }//validation ends here


        var hotelTable = $("#id_appliacnt_table").DataTable({
            responsive: true,
            orderCellsTop: true,
            autoWidth: false,
            serverSide: false,
            processing: true,
            lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "All"]],
            language: {
                processing: "<div class='sk-spinner sk-spinner-three-bounce'><div class='sk-bounce1'></div><div class='sk-bounce2'></div><div class='sk-bounce3'></div></div>"
            },
            ajax: {
                "url": "/DMC_Management_System/HotelController",
                "type": "GET",
                "error": function (e) {
                },
                "dataSrc": function (d) {
                    return d;
                }
            },
            deferRender: true,
            columns: [
                {"data": null, "width": "1%", "visible": true},
                {"data": "id", "width": "5%", "visible": false},
                {"data": "name", "width": "5%", "render": function (data, type, row, meta) {
                        if (type === 'display') {
                            return $('<a>')
                                    .attr('href', '#/hotel_details/' + row.id + '/' + row.name.replace(/\s+/g, ''))
                                    .text(data)
                                    .wrap('<div></div>')
                                    .parent()
                                    .html();
                        } else {
                            return data;
                        }
                    }},
                {"data": "nameCN", "width": "5%"},
                {"data": "city", "width": "5%"},
                {"data": "category", "width": "4%"},
                {"data": "type", "width": "5%"},
                {"data": "chain", "width": "5%"},
                {"data": "address", "width": "5%"},
                {"data": "gps", "width": "5%"}

            ],
            colReorder: true,
            dom: "<'row table-toolbar'<'col-sm-1'<'#b3'>><'col-sm-6'B><'col-sm-1'l> <'col-sm-2'f>> <'row'>" +
                    "<'row'<'col-sm-12'tr>>" +
                    "<'row'<'col-sm-5'i><'col-sm-7'p>>",
            columnDefs: [
                {
                    'targets': 0,
                    'checkboxes': {
                        'selectRow': true
                    }
                }
            ],
            select: {
                'style': 'multi'
            },
            'order': [[1, 'asc']],
            buttons: [
                {
                    text: '<i class="fa fa-plus"></i> New Hotel',
                    className: 'btn-primary',
                    container: '#b3',
                    action: function (e, dt, node, config) {
                        window.location.href = "#/new_hotel";
                    }
                },
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5',
                {
                    extend: 'colvis',
                    text: '<i class="fa fa-gears"></i>',
                    fade: true
                }
            ]
        });
        var settings = '<div class="btn-group btn-group-solid">\
            <button type="button" class="btn btn-default dropdown-toggle" style="margin-right:8px"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">\
            Action <span class="caret"></span>\
            </button>\
            <ul class="dropdown-menu">\
             <li><a href="#" id="td-edit">Edit</a></li>\
             <li><a href="#" id="td-delete">Delete</a></li>\
            </ul>\
            </div>';

        $("#b3").append(settings);

        // Handle row deletion
        $("#td-delete").on('click', function () {
            if (hotelTable.column(0).checkboxes.selected().length > 0) {
                $("#confirm-delete").modal();
            }
        });

        $("#btn-delete").on('click', function () {

            var id = hotelTable.column(0).checkboxes.selected();

            $.each(id, function (k, v) {

                deleteHotel(v.id);
                hotelTable.ajax.reload();

            });

            $("#confirm-delete").modal('hide');

            hotelTable.ajax.reload();

        });

        // Handle row Edition
        $("#td-edit").on('click', function () {
            if (hotelTable.column(0).checkboxes.selected().length > 0) {
                var id = hotelTable.column(0).checkboxes.selected();
                $.each(id, function (k, v) {
                    $("#idEdit").val(v.id);
                    $("#nameEdit").val(v.name);
                    $("#nameCNEdit").val(v.nameCN);
                    $("#cityEdit").val(v.city);
                    $("#catEdit").val(v.category);
                    $("#typeEdit").val(v.type);
                    $("#chainEdit").val(v.chain);
                    $("#addressEdit").val(v.address);
                    $("#gpsEdit").val(v.gps);
                });

                $("#confirm-edit").modal();
            }
        });

        $("#btn-hotel-edit").on('click', function () {
            updateHotel($("#idEdit").val(),
                    $("#nameEdit").val(),
                    $("#nameCNEdit").val(),
                    $("#cityEdit").val(),
                    $("#catEdit").val(),
                    $("#typeEdit").val(),
                    $("#chainEdit").val(),
                    $("#addressEdit").val(),
                    $("#gpsEdit").val());
            $("#confirm-edit").modal('hide');
            hotelTable.ajax.reload();
        });

    };//end of init function

    fns.initContacts = function (hotelID) {

        // alert(hotelID);
        {//validation
            // initialize the validator function
            validator.message.date = 'not a real date';

            // validate a field on "blur" event, a 'select' on 'change' event & a '.reuired' classed multifield on 'keyup':
            $('form')
                    .on('blur', 'input[required], input.optional, select.required', validator.checkField)
                    .on('change', 'select.required', validator.checkField)
                    .on('keypress', 'input[required][pattern]', validator.keypress);

            $('.multi.required').on('keyup blur', 'input', function () {
                validator.checkField.apply($(this).siblings().last()[0]);
            });

            $('form').submit(function (e) {
                e.preventDefault();
                var submit = true;

                // evaluate the form using generic validaing
                if (!validator.checkAll($(this))) {
                    submit = false;
                }

                if (submit) {
                    //alert("save contact")

                    saveContact(hotelID,
                            $('#Pname').val(),
                            $('#Position').val(),
                            $('#num1').val(),
                            $('#num2').val(),
                            $('#email').val());
                }
                return false;
            });
        }//validation ends here

        var hotelContactTable = $("#contact_table").DataTable({
            responsive: true,
            orderCellsTop: true,
            autoWidth: false,
            serverSide: false,
            processing: true,
            lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "All"]],
            language: {
                processing: "<div class='sk-spinner sk-spinner-three-bounce'><div class='sk-bounce1'></div><div class='sk-bounce2'></div><div class='sk-bounce3'></div></div>"
            },
            ajax: {
                "url": "/DMC_Management_System/ContactController?id=" + hotelID,
                "type": "GET",
                "error": function (e) {
                },
                "dataSrc": function (d) {
                    return d;
                }
            },
            deferRender: true,
            columns: [
                {"data": null, "width": "1%", "visible": true},
                {"data": "contactID", "width": "5%", "visible": false},
                {"data": "hotelID", "width": "5%", "visible": false},
                {"data": "personName", "width": "5%"},
                {"data": "position", "width": "5%"},
                {"data": "number1", "width": "4%"},
                {"data": "number2", "width": "5%"},
                {"data": "email", "width": "5%"}

            ],
            colReorder: true,
            dom: "<'row table-toolbar'<'col-sm-1'<'#b3'>><'col-sm-6'B><'col-sm-1'l> <'col-sm-2'f>> <'row'>" +
                    "<'row'<'col-sm-12'tr>>" +
                    "<'row'<'col-sm-5'i><'col-sm-7'p>>",
            columnDefs: [
                {
                    'targets': 0,
                    'checkboxes': {
                        'selectRow': true
                    }
                }
            ],
            select: {
                'style': 'multi'
            },
            'order': [[1, 'asc']],
            buttons: [
                {
                    text: '<i class="fa fa-plus"></i> New Contact',
                    className: 'btn-primary',
                    container: '#b3',
                    action: function (e, dt, node, config) {
                        window.location.href = "#/new_contact/" + hotelID;
                    }
                },
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5',
                {
                    extend: 'colvis',
                    text: '<i class="fa fa-gears"></i>',
                    fade: true
                }
            ]
        });
        var settings = '<div class="btn-group btn-group-solid">\
            <button type="button" class="btn btn-default dropdown-toggle" style="margin-right:8px"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">\
            Action <span class="caret"></span>\
            </button>\
            <ul class="dropdown-menu">\
             <li><a href="#" id="td-edit">Edit</a></li>\
             <li><a href="#" id="td-delete">Delete</a></li>\
            </ul>\
            </div>';
        $("#b3").append(settings);
    };//end of the init contact
    return fns;
})();


