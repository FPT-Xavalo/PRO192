
package data;

public class Address {
    protected int houseNumber;
    protected String streetName;
    protected String ward;
    protected String district;
    protected String province;
    // Constuctor

    public Address(int houseNumber, String streetName, String ward, String district, String province) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.ward = ward;
        this.district = district;
        this.province = province;
    }
    // Get & set methods

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    // ToString

    @Override
    public String toString() {
        return "Address{" + "houseNumber=" + houseNumber + ", streetName=" + streetName + ", ward=" + ward + ", district=" + district + ", province=" + province + '}';
    }
    
}
