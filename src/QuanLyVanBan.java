public class QuanLyVanBan {
    VanBan vanBan = new VanBan();

    public void NhapVanBan(String noiDung) {
        vanBan.setNoiDung(noiDung);
        System.out.println(vanBan.getNoiDung());
    }

    public int DemKyTuTrongXauChuoi() {
        int count = 0;
        for (int i = 0; i < vanBan.getNoiDung().length(); i++) {
            if (vanBan.getNoiDung().charAt(i) == 'h' || vanBan.getNoiDung().charAt(i) == 'H') {
                count++;
            }
        }
        return count;
    }

    public int DemTuTrongXau() {
        int count = 0;
        String[] noiDung = vanBan.getNoiDung().split("");
        count = noiDung.length;
        return count;
    }

    public String ChuanHoaChuoi(String vb) {
        VanBan vanBan = new VanBan(vb);

        String noiDung = vanBan.getNoiDung();




        while (noiDung.contains("  ")) {

            String noiDungMoi = noiDung.replaceAll("  ", " ");
            noiDung = noiDungMoi;

        }

        return noiDung;
    }
}
