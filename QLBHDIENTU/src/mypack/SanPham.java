package mypack;

public class SanPham {
	int idsanpham;
	String tensanpham;
	double dongia;
	int thoihanbaohanh;
	int namsanxuat;
	NhaCungCap NhaCungCap;
	LoaiHang LoaiHang;

	public SanPham (SanPham sp){
		this.idsanpham = sp.idsanpham;
		this.tensanpham = sp.tensanpham;
		this.dongia = sp.dongia;
		this.thoihanbaohanh = sp.thoihanbaohanh;
		this.namsanxuat = sp.namsanxuat;
		this.NhaCungCap = sp.NhaCungCap;
		this.LoaiHang = sp.LoaiHang;
	}
	
	public SanPham (int idsanpham, String tensanpham, double dongia, int thoihanbaohanh,
			int namsanxuat, NhaCungCap NhaCungCap, LoaiHang LoaiHang){
		this.idsanpham = idsanpham;
		this.tensanpham = tensanpham;
		this.dongia = dongia;
		this.thoihanbaohanh = thoihanbaohanh;
		this.namsanxuat = namsanxuat;
		this.NhaCungCap =  new NhaCungCap(NhaCungCap);
		this.LoaiHang = LoaiHang;
	}
	public int getIDSanPham() {
		return idsanpham;
	}
	
	public String getTenSanPham() {
		return tensanpham;
	}
	
	public double getDonGia() {
		return dongia;
	}
	
	public int getThoiHanBaoHanh() {
		return thoihanbaohanh;
	}
	
	public int getNamSanXuat() {
		return namsanxuat;
	}
	
	public NhaCungCap getNhaCungCap() {
		return NhaCungCap;
	}
	
	public LoaiHang getLoaiHang() {
		return LoaiHang;
	}
	
}
