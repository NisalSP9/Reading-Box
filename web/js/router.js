/* global hotels */

$('document').ready(function () {
    //
    // create some functions to be executed when
    // the correct route is issued by the user.
    //
    var showNewHotel = function () {

        console.log("hello new hotel");
        $.get('components/hotels/hotels.jsp', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
            hotels.init();
        });
    };
     var showNewContact = function (id) {

        console.log("hello new contact");
        $.get('components/hotels/new_contact.html', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
            hotels.initContacts(id);
        });
    };
    
    var showHotelDetail = function (id,name) {

        console.log("hello hotel Details");
        $.get('components/hotels/hotel_details.html', function (template) {
            var rendered = Mustache.render(template, {name:name});
            $('#main-content').html(rendered);
            hotels.initContacts(id);
        });
    };
    
    
    var showVehicles = function () {

        console.log("hello vehicles");
        $.get('components/vehicles/vehicles.jsp', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
        });
    };

    var showHotels = function () {

        console.log("hello Hotels");
        $.get('components/hotels/view_hotels.html', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
            hotels.init();
        });
    };


    var showGuides = function () {
        console.log("hello guides");
        $.get('components/guides/guides.jsp', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
//            creative.init();

        });
    };


    var showRests = function () {

        console.log("hello Rest");
        $.get('components/rests/rests.jsp', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
            //campaigns.init();
        });
    };


    var showVendors = function () {
        console.log("hello vendors");
        $.get('components/vendors/vendors.jsp', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
            //  creative.init();

        });
    };

    var showShops = function () {
        console.log("hello shops");
        $.get('components/shops/shops.jsp', function (template) {
            var rendered = Mustache.render(template, {});
            $('#main-content').html(rendered);
            //  creative.init();

        });
    };

    //
    // define the routing table.
    //
    var routes = {
        '/new_hotel':showNewHotel,        
        '/hotels': showHotels,
        '/hotel_details/:hotelID/:hotelName':showHotelDetail,
        '/new_contact/:hotelID':showNewContact, 
        '/vehicles': showVehicles,
        '/guides': showGuides,
        '/rests': showRests,
        '/vendors': showVendors,
        '/shops': showShops

    };

    //
    // instantiate the router.
    //
    var router = Router(routes);
    router.init();
});