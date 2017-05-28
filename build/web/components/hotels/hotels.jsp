<%-- 
    Document   : CBR_project
    Created on : Oct 16, 2016, 11:08:48 PM
    Author     : nisalsp9
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="row">
    <div class="col-md-12 col-sm-12 col-xs-12">
        <div class="x_panel">
            <div class="x_content">
                <form id="hotelForm" class="form-horizontal form-label-left" novalidate>
                    <span class="section">Hotel Information</span>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="name"> Hotel Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="name" class="form-control col-md-7 col-xs-12" name="name" placeholder="" required="required" type="text">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="nameCN"> Hotel Name CN<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="nameCN" class="form-control col-md-7 col-xs-12" name="CN" placeholder="" required="required" type="text">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">City</label>
                        <div class="col-md-6 col-xs-12">
                            <select id="city" class="form-control">
                                <option>Anuradhapura</option>
                                <option>Kandy</option>
                                <option>Galle</option>
                                <option>Kalutara</option>
                                <option>Colombo</option>
                                <option>Galle</option>
                                <option>Matara</option>
                                <option>Monaragala</option>
                                <option>Trincomalee</option>
                                <option>Jaffna</option>
                                <option>Rathnapura</option>
                                <option>Polonnaruwa</option>
                                <option>Mathale</option>
                                <option>Kegalle</option>
                                <option>Nuwara Eliya</option>
                                <option>Gampaha</option>
                                <option>Puttalama</option>
                                <option>Kurunegala</option>
                            </select>
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Hotel Category</label>
                        <div class="col-md-6 col-xs-12">
                            <select id="cat" class="form-control">
                                <option>Other</option>
                                <option>One Star</option>
                                <option>Two Star</option>
                                <option>Three Star</option>
                                <option>Four Star</option>
                                <option>Five Star</option>
                            </select>
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Hotel Type</label>
                        <div class="col-md-6 col-xs-12">
                            <select id="type" class="form-control">
                                <option>Under 200 Rooms</option>
                                <option>200 to 399 Rooms</option>
                                <option>400 to 700 Rooms</option>
                                <option>More than 700 Rooms</option>                                
                            </select>
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12">Hotel Chain</label>
                        <div class="col-md-6 col-xs-12">
                            <select id="chain" class="form-control">
                                <option>Jet Wing</option>
                                <option>Amaya</option>
                                <option>Laya</option>
                                <option>Araliya</option>
                                <option>JKH</option>
                                <option>Taj</option>
                                <option>Other</option>
                            </select>
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="address">Address <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <textarea id="address"  name="Address" placeholder="" class="form-control col-md-7 col-xs-12"></textarea>
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="gps">GPS Location<span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <textarea id="gps"  name="gps" placeholder="" class="form-control col-md-7 col-xs-12"></textarea>
                        </div>
                    </div>
<!--                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="rename">Reservation Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="rename" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="rename" placeholder="" required="required" type="text">
                        </div>
                    </div>


                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="rephone">Reservation Telephone <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="tel" id="rephone" name="rephone" placeholder="" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>

                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Reservation Email <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="email" id="email" name="email" required="required" class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="saname"> Hotel's Sales Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="saname" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="saname" placeholder="" required="required" type="text">
                        </div>
                    </div>


                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="saphone">Hotel's Sales Telephone <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="tel" id="saphone" name="saphone" placeholder="" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>
                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="gm_name"> Hotel's GM Name <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input id="gm_name" class="form-control col-md-7 col-xs-12" data-validate-length-range="6" data-validate-words="2" name="gm_name" placeholder="" required="required" type="text">
                        </div>
                    </div>


                    <div class="item form-group">
                        <label class="control-label col-md-3 col-sm-3 col-xs-12" for="gm_phone">Hotel's GM Telephone <span class="required">*</span>
                        </label>
                        <div class="col-md-6 col-sm-6 col-xs-12">
                            <input type="tel" id="gm_phone" name="gm_phone" placeholder="" required="required" data-validate-length-range="8,20" class="form-control col-md-7 col-xs-12">
                        </div>
                    </div>-->

                    <div class="ln_solid"></div>
                    <div class="form-group">
                        <div class="col-md-6 col-md-offset-3">
                            <button id="reset" type="reset" class="btn btn-primary">Reset</button>
                            <button id="save" class="btn btn-success">Save</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>


