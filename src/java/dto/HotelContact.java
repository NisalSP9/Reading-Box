package dto;

/**
 *
 * @author nisalsp9
 */
public class HotelContact {
    
    private String contactId;
    private String hotelId;
    private String personName;
    private String personPosition;
    private String phoneNum1;
    private String phoneNum2;
    private String email;

    public HotelContact() {
    }

    public HotelContact(String contactId, String hotelId, String personName, String personPosition, String phoneNum1, String phoneNum2, String email) {
        this.contactId = contactId;
        this.hotelId = hotelId;
        this.personName = personName;
        this.personPosition = personPosition;
        this.phoneNum1 = phoneNum1;
        this.phoneNum2 = phoneNum2;
        this.email = email;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(String personPosition) {
        this.personPosition = personPosition;
    }

    public String getPhoneNum1() {
        return phoneNum1;
    }

    public void setPhoneNum1(String phoneNum1) {
        this.phoneNum1 = phoneNum1;
    }

    public String getPhoneNum2() {
        return phoneNum2;
    }

    public void setPhoneNum2(String phoneNum2) {
        this.phoneNum2 = phoneNum2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
