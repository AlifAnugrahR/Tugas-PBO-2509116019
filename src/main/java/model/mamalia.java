package model;

public class mamalia extends satwa {

    private String habitat;

    public mamalia(int id, String nama, String jenis, String habitat) {
        super(id, nama, jenis);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        super.cetakStatus();
        System.out.println(">> Habitat: " + habitat);
    }
}