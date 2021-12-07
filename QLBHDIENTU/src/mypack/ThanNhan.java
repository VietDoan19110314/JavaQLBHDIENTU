package mypack;
import java.util.Date;
public class ThanNhan {
	int idthannhan;
	String tenthannhan;
	String quanhe;
	String gioitinh;
	Date ngaysinh;
	NhanVien NhanVien;
	
	public ThanNhan (ThanNhan tn){
		this.idthannhan = tn.idthannhan;
		this.tenthannhan = tn.tenthannhan;
		this.quanhe = tn.quanhe;
		this.gioitinh = tn.gioitinh;
		this.ngaysinh = tn.ngaysinh;
		this.NhanVien = tn.NhanVien;
	}
	
	public ThanNhan (int idthannhan, String tenthannhan, String quanhe, String gioitinh, Date ngaysinh, NhanVien NhanVien){
		this.idthannhan = idthannhan;
		this.tenthannhan = tenthannhan;
		this.quanhe = quanhe;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.NhanVien = NhanVien;
	}
	
	public int getIDThanhNhan() {
		return idthannhan;
	}
	
	public String getTenNhaThanNhan() {
		return tenthannhan;
	}
	
	public String getQuanHe() {
		return quanhe;
	}
	
	public String getGioiTinh() {
		return gioitinh;
	}
	
	public Date getNgaySinh() {
		return ngaysinh;
	}
	public NhanVien NhanVien() {
		return NhanVien;
	}
	
}
