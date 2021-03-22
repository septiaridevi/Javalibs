import javax.swing.JOptionPane;
public class JavaLibs5026201062 
{
	public static void main (String[]args)
	{
	double saku, pengeluaran;

        String ask1 =JOptionPane.showInputDialog("nama kamu:");
        String ask2 =JOptionPane.showInputDialog("jenis kelamin:");
        String ask3 = JOptionPane.showInputDialog("tanggal kamu lahir:");
        String ask4 = JOptionPane.showInputDialog("bulan kamu lahir:");
        String ask5 = JOptionPane.showInputDialog("tahun kamu lahir:");
        String ask6 = JOptionPane.showInputDialog("jurusan kuliah kamu:");
        String ask7 = JOptionPane.showInputDialog("tahun masuk kuliah:");
        String ask8 = JOptionPane.showInputDialog("kota asal kamu:");
        String ask9 = JOptionPane.showInputDialog("uang saku per bulan:");
        String ask10 = JOptionPane.showInputDialog("pengeluaran perbulan:");

        saku = Double.parseDouble(ask9);
        pengeluaran = Double.parseDouble(ask10);

        double sisa = (saku-pengeluaran)/30;
        double tabungan = sisa*4*365;

        int angkatan = Integer.parseInt(ask7);
        int tahun = Integer.parseInt(ask5);

        int lulus = angkatan+4;
        int usia = tahun+4;

        JOptionPane.showMessageDialog(null,"Hai mahasiswa baru. "
                +"\nBerikut biodata kamu! nama :"+" "+ask1+", "+ask2+", lahir "+ask3+" "+ask4+" "+ask5+"" + "" +
                "\nmengambil jurusan "+ask6+" angkatan "+ask7+". Kota asal kamu "+ask8+". " +
                "\nSelama kuliah kamu akan mampu menyisihkan uang saku sebesar Rp."+" "+sisa+" "+"perharinya. " +
                "\nSetelah kamu lulus di tahun "+lulus+", kamu akan berusia "+usia+" dan memiliki tabungan sebesar Rp."+" "+tabungan);
}
}
