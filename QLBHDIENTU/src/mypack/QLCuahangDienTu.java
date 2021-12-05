package mypack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.*;
import java.math.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
 
public class QLCuahangDienTu {
	public static List<LoaiHang> dsLoaiHang = new ArrayList<>();
	public static List<NhaCungCap> dsNhaCungCap = new ArrayList<>();
	public static List<KhachHang> dsKhachHang = new ArrayList<>();
	public static List<CuaHang> dsCuaHang = new ArrayList<>();
	public static List<SanPham> dsSanPham = new ArrayList<>();
	public static List<NhanVien> dsNhanVien = new ArrayList<>();
	public static List<ThanNhan> dsThanNhan = new ArrayList<>();
	public static List<HoaDon> dsHoaDon = new ArrayList<>();
	public static List<Kho> dsKho = new ArrayList<>();
	public static List<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();
	
	public static List<LoaiHang> createDSLoaiHang() {
		dsLoaiHang.add(
				new LoaiHang(
						1,
						"Laptop"));
		dsLoaiHang.add(
				new LoaiHang(
						2,		
						"Dien thoai di dong"));
		dsLoaiHang.add(
				new LoaiHang(
						3,		
						"Tivi"));
		dsLoaiHang.add(
				new LoaiHang(
						4,		
						"Tu lanh"));
		dsLoaiHang.add(
				new LoaiHang(
						5,		
						"May giat"));
		dsLoaiHang.add(
				new LoaiHang(
						6,		
						"May dieu hoa"));

		return dsLoaiHang;
	}
	public static List<NhaCungCap> createdsNhaCungCap() {
		dsNhaCungCap.add(
				new NhaCungCap(
						1,
						"Nha cung cap Hoai Phong",
						"A24 Cong Quynh, Phuong Nguyen Cu Trinh, Quan 1, Thanh pho Ho Chi Minh",
						"0925306345",
						"hoaiphong@gmail.com"));
		dsNhaCungCap.add(
				new NhaCungCap(
						2,
						"Nha cung cap Dien Tu VIP",
						"151, Duong Nguyen Du, Phuong Ben Thanh, Quan 1, Thanh pho Ho Chi Minh",
						"0936368581",
						"dienmayVIP@gmail.com"));
		dsNhaCungCap.add(
				new NhaCungCap(
						3,
						"Nha cung cap Techbot",
						"Kim Giang, Phuong Dai Kim, Quan Hoang Mai, Ha Noi",
						"0905644699",
						"techbot@gmail.com"));
		dsNhaCungCap.add(
				new NhaCungCap(
						4,
						"Nha cung cap Intelligent",
						"So 175 duong Thich Quang Duc, Phuong Chanh Nghia, TP. Thu Dau Mot, Binh Duong.",
						"0912345678",
						"intelligent@gmail.com"));
		return dsNhaCungCap;
	}

	public static List<KhachHang> createDSKhachHang() {
		//SimpleDateFormat dateForm = new SimpleDateFormat ("dd/mm/yyyy");
		Date dt1 = new Date(20/12/1993);
		
		dsKhachHang.add(
				new KhachHang(
						1,
						"Nguyen Van Nam",
						"Nam",
						dt1,
						"0973144226",
						"namnv@gmail.com",
						 "215B Mai Xuan Thuong, Phuong 6, Quan 6, Thanh pho Ho Chi Minh"));
		Date dt2 = new Date(05/06/1995);
		dsKhachHang.add(
				new KhachHang(
						2,
						"Le Thi Tuyet",
						"Nu",
						dt2,
						"0941279287",
						"tuyetlt@gmail.com",
						"DH409, KP Ba Tri, P, Tan Uyen, Binh Duong"));	
		Date dt3 = new Date(27/02/1998);
		dsKhachHang.add(	
				new KhachHang(
						3,
						"Nguyen Minh Chien",
						"Nam",
						dt3,
						"0951216329",
						"chiennm@gmail.com", 
						"65 Tan Huong, Phuong Tan Quy, Quan Tan Phu, TPHCM"));
		Date dt4 = new Date(12/04/2000);
		dsKhachHang.add(	
				new KhachHang(
						4,
						"Tran Nguyen Vu",
						"Nam",
						dt4,
						"0978126445",
						 "vutn@gmail.com", 
						 "Nguyen Van Luong, Phuong 17, Quan Go Vap, TPHCM"));
		Date dt5 = new Date(05/06/1998);
		dsKhachHang.add(	
				new KhachHang(
						5,
						"Nguyen Thi Nga",
						"Nu",
						dt5,
						"0988667889", 
						"ngant@gmail.com",
						"191 Van Chuong, Phuong Van Chuong, Quan Dong Da, Ha Noi"));
		return dsKhachHang;
	}
	public static List<CuaHang> createDSCuaHang() {
		dsCuaHang.add(
				new CuaHang(
						1,
						"245, quan Cau Giay, Ha Noi", 
						"0979796721", 
						"fpt@gmail.com"
						));
		dsCuaHang.add(
				new CuaHang(
						2,
						"123, Phuong Ben Thanh, Quan 1, Thanh pho Ho Chi Minh", 
						"0932331414", 
						"tgdd@gmail.com"
						));
		dsCuaHang.add(
				new CuaHang(
						3,
						 "226 Phuong Dai Kim, Quan Hoang Mai, Ha Noi", 
						 "0928294422", 
						 "vuphong@gmail.com"
						));
		return dsCuaHang;
	}
	public static List<SanPham> createDSSanPham() {
		dsSanPham.add(
				new SanPham(
						1,
						"Laptop Asus",
						16000000,
						1,
						2021,
						dsNhaCungCap.get(0),
						dsLoaiHang.get(0)
						));
		dsSanPham.add(
				new SanPham(
						2,
						"Macbook",
						42900000,
						2,
						2021,
						dsNhaCungCap.get(0),
						dsLoaiHang.get(0)
						));	
		dsSanPham.add(
				new SanPham(
						3,
						"Laptop Dell",
						10999000,
						2,
						2020,
						dsNhaCungCap.get(1),
						dsLoaiHang.get(0)
						));
		dsSanPham.add(
				new SanPham(
						4,
						"Laptop Lenovo",
						18699000,
						2,
						2021,
						dsNhaCungCap.get(1),
						dsLoaiHang.get(0)
						));
		dsSanPham.add(
				new SanPham(
						5,
						"Dien thoai Iphone",
						33990000,
						2,
						2021,
						dsNhaCungCap.get(0),
						dsLoaiHang.get(1)
						));
		dsSanPham.add(
				new SanPham(
						6,
						"Dien thoai Samsung",
						14990000,
						1,
						2021,
						dsNhaCungCap.get(1),
						dsLoaiHang.get(1)
						));
		dsSanPham.add(
				new SanPham(
						7,
						"Dien thoai Oppo",
						 19990000,
						1,
						2021,
						dsNhaCungCap.get(0),
						dsLoaiHang.get(1)
						));
		dsSanPham.add(
				new SanPham(
						8,
						"Dien thoai Samsung 1",
						5290000,
						2,
						2020,
						dsNhaCungCap.get(1),
						dsLoaiHang.get(1)
						));
		dsSanPham.add(
				new SanPham(
						9,
						"Dien thoai Iphone 1",
						32500000,
						2,
						2020,
						dsNhaCungCap.get(0),
						dsLoaiHang.get(1)
						));
		dsSanPham.add(
				new SanPham(
						10,
						"Dien thoai Lenovo",
						 2600000,
						2,
						2019,
						dsNhaCungCap.get(1),
						dsLoaiHang.get(1)
						));
		dsSanPham.add(
				new SanPham(
						11,
						"Tivi LG",
						11200000,
						1,
						2021,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(2)
						));
		dsSanPham.add(
				new SanPham(
						12,
						"Tivi SamSung",
						25000000,
						2,
						2021,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(2)
						));
		dsSanPham.add(
				new SanPham(
						13,
						"Tivi Android Sony",
						15800000,
						2,
						2021,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(2)
						));
		dsSanPham.add(
				new SanPham(
						14,
						"Tu lanh Sanyo",
						4600000,
						1,
						2021,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(3)
						));
		dsSanPham.add(
				new SanPham(
						15,
						"Tu lanh Panasonic",
						12500000,
						2,
						2021,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(3)
						));
		dsSanPham.add(
				new SanPham(
						16,
						"Tu lanh Toshiba",
						19300000,
						2,
						2021,
						dsNhaCungCap.get(3),
						dsLoaiHang.get(3)
						));
		dsSanPham.add(
				new SanPham(
						17,
						"Tu lanh Sharp",
						7500000,
						2,
						2018,
						dsNhaCungCap.get(3),
						dsLoaiHang.get(3)
						));
		dsSanPham.add(
				new SanPham(
						18,
						"May giat Panasonic",
						7500000,
						2,
						2019,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(4)
						));
		dsSanPham.add(
				new SanPham(
						19,
						"May giat Toshiba",
						10090000,
						2,
						2018,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(4)
						));
		dsSanPham.add(
				new SanPham(
						20,
						"May giat Sharp",
						6290000,
						2,
						2017,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(4)
						));
		dsSanPham.add(
				new SanPham(
						21,
						"May dieu hoa Casper",
						12950000,
						2,
						2021,
						dsNhaCungCap.get(3),
						dsLoaiHang.get(5)
						));
		dsSanPham.add(
				new SanPham(
						22,
						"May dieu hoa Panasonic",
						15960000,
						2,
						2021,
						dsNhaCungCap.get(3),
						dsLoaiHang.get(5)
						));
		dsSanPham.add(
				new SanPham(
						23,
						"May dieu hoa Toshiba",
						6800000,
						2,
						2020,
						dsNhaCungCap.get(3),
						dsLoaiHang.get(5)
						));
		dsSanPham.add(
				new SanPham(
						24,
						"May dieu hoa LG",
						9490000,
						2,
						2021,
						dsNhaCungCap.get(3),
						dsLoaiHang.get(5)
						));
		dsSanPham.add(
				new SanPham(
						25,
						"Laptop Asus 1",
						17000000,
						1,
						2021,
						dsNhaCungCap.get(1),
						dsLoaiHang.get(0)
						));
		dsSanPham.add(
				new SanPham(
						26,
						"May dieu hoa Casper 1",
						13000000,
						2,
						2021,
						dsNhaCungCap.get(2),
						dsLoaiHang.get(5)
						));

		return dsSanPham;
	}
	public static List<NhanVien> createDSNhanVien() {
		//SimpleDateFormat dateForm = new SimpleDateFormat ("dd/mm/yyyy");
		Date dt1 = new Date(22/12/1999);
		Date dt2 = new Date(11/03/2015);
		dsNhanVien.add(
				new NhanVien(
						1,
						"Nguyen Manh Hung",
						"Nam",
						dt1,
			            "416 Kim Nguu, Phuong Vinh Tuy, Quan Hai Ba Trung, Ha Noi",
						 dt2,
						 10000000,
						 dsCuaHang.get(0)
						));
		Date dt3 = new Date(22/05/2000);
		Date dt4 = new Date(12/04/2016);
		dsNhanVien.add(
				new NhanVien(
						2,
						"Tran Tieu Vy",
						"Nu",
						dt3,
						"123, Phuong Ben Thanh, Quan 1, tp. Ho Chi Minh",
						 dt4,
						 9000000,
						 dsCuaHang.get(1)
						));	
		Date dt5 = new Date(01/8/2001);
		Date dt6 = new Date(02/11/2018);
		dsNhanVien.add(
				new NhanVien(
						3,
						"Nguyen Manh Son",
						"Nam",
						dt5,
						"416 Kim Nguu, Phuong Vinh Tuy, Quan Hai Ba Trung, Ha Noi",
						 dt6,
						 11000000,
						 dsCuaHang.get(0)
						));	
		Date dt7 = new Date(11/10/2001);
		Date dt8 = new Date(23/12/2017);
		dsNhanVien.add(
				new NhanVien(
						4,
						"Dinh Bao Long",
						"Nam",
						dt7,
						"456, Phuong Ben Thanh, Quan 1, tp. Ho Chi Minh",
						 dt8,
						 10500000,
						 dsCuaHang.get(1)
						));
		dsNhanVien.add(
				new NhanVien(
						6,
						"Tran Thi Linh",
						"Nu",
						dt5,
						"124, Phuong Ben Thanh, Quan 1, tp. Ho Chi Minhi",
						 dt6,
						 11002000,
						 dsCuaHang.get(1)
						));	
		Date dt9 = new Date(11/05/2000);
		Date dt10 = new Date(21/07/2017);
		dsNhanVien.add(
				new NhanVien(
						5,
						"To Van Dien",
						"Nam",
						dt9,
						 "457, quan Cau Giay, Ha Noi",
						 dt10,
						 11500000,
						 dsCuaHang.get(2)
						));	
		Date dt11 = new Date(12/06/2000);
		Date dt12 = new Date(05/05/2017);
		dsNhanVien.add(
				new NhanVien(
						7,
						"Doan Van Huy",
						"Nam",
						dt11,
						"468, quan Cau Giay, Ha Noi",
						 dt12,
						 7500000,
						 dsCuaHang.get(2)
						));	
		Date dt13 = new Date(07/07/2000);
		Date dt14 = new Date(8/8/2020);
		dsNhanVien.add(
				new NhanVien(
						8,
						"Doan Van Chien",
						"Nam",
						dt13,
						"468, quan Cau Giay, Ha Noi",
						 dt14,
						 7600000,
						 dsCuaHang.get(2)
						));	
		return dsNhanVien;
	}
	public static List<ThanNhan> createDSThanNhan() {
		//SimpleDateFormat dateForm = new SimpleDateFormat ("dd/mm/yyyy");
		Date dt1 = new Date(21/11/1965);
		dsThanNhan.add(
				new ThanNhan(
						1,
						"Nguyen Manh Cuong",
						"Bo",
						"Nam",
						dt1,
						dsNhanVien.get(0)
						));
		Date dt2 = new Date(28/03/1969);
		dsThanNhan.add(
				new ThanNhan(
						2,
						"Le Thi Hong",
						"Me",
						"Nu",
						dt2,
						dsNhanVien.get(2)
						));
		Date dt3 = new Date(06/07/1961);
		dsThanNhan.add(
				new ThanNhan(
						3,
						"Tran Hoang Long",
						"Bo",
						"Nam",
						dt3,
						dsNhanVien.get(1)
						));
		Date dt4 = new Date(07/8/1961);
		dsThanNhan.add(
				new ThanNhan(
						4,
						"Dinh Nguyen Bao",
						"Bo",
						"Nam",
						dt4,
						dsNhanVien.get(3)
						));
		Date dt5 = new Date(13/05/1954);
		dsThanNhan.add(
				new ThanNhan(
						5,
						"To Ngoc Anh",
						"Me",
						"Nu",
						dt5,
						dsNhanVien.get(4)
						));
		Date dt6 = new Date(14/06/1955);
		dsThanNhan.add(
				new ThanNhan(
						6,
						"Tran Dang Khoa",
						"Bo",
						"Nam",
						dt6,
						dsNhanVien.get(5)
						));
		Date dt7 = new Date(12/12/1966);
		dsThanNhan.add(
				new ThanNhan(
						7,
						"Doan Van Chinh",
						"Bo",
						"Nam",
						dt7,
						dsNhanVien.get(6)
						));
		Date dt8 = new Date(10/10/1968);
		dsThanNhan.add(
				new ThanNhan(
						8,
						"Doan Ngoc Phuong Linh",
						"Me",
						"Nu",
						dt8,
						dsNhanVien.get(7)
						));
		return dsThanNhan;
	}
	public static List<Kho> createDSKho() {
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(0),
						10
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(2),
						30
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(3),
						42
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(5),
						27
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(7),
						23
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(9),
						50
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(1),
						11
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(4),
						12
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(6),
						13
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(0),
						dsSanPham.get(8),
						14
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(0),
						15
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(2),
						16
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(3),
						17
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(5),
						18
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(1),
						19
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(4),
						19
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(6),
						19
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(7),
						19
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(8),
						19
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(1),
						dsSanPham.get(9),
						19
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(10),
						20
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(11),
						10
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(12),
						11
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(13),
						10
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(14),
						10
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(17),
						13
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(18),
						14
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(19),
						20
						));
		dsKho.add(
				new Kho(
						dsCuaHang.get(2),
						dsSanPham.get(20),
						12
						));
		return dsKho;
	}
	public static List<HoaDon> createDSHoaDon() {
		//SimpleDateFormat dateForm = new SimpleDateFormat ("dd/mm/yyyy");
		Date dt1 = new Date(22/12/2021);
		dsHoaDon.add(
				new HoaDon(
						100,
						dt1,
						dsNhanVien.get(0),
						dsKhachHang.get(0),
						dsCuaHang.get(0)
						));
		
		Date dt2 = new Date(11/03/2021);
		dsHoaDon.add(
				new HoaDon(
						101,
						dt2,
						dsNhanVien.get(2),
						dsKhachHang.get(1),
						dsCuaHang.get(0)
						));
		Date dt3 = new Date(22/05/2021);
		dsHoaDon.add(
				new HoaDon(
						102,
						dt3,
						dsNhanVien.get(2),
						dsKhachHang.get(2),
						dsCuaHang.get(0)
						));
		Date dt4 = new Date(12/06/2021);
		dsHoaDon.add(
				new HoaDon(
						103,
						dt4,
						dsNhanVien.get(1),
						dsKhachHang.get(0),
						dsCuaHang.get(1)
						));
		Date dt5 = new Date(04/9/2021);
		dsHoaDon.add(
				new HoaDon(
						104,
						dt5,
						dsNhanVien.get(1),
						dsKhachHang.get(1),
						dsCuaHang.get(1)
						));
		Date dt6 = new Date(04/9/2021);
		dsHoaDon.add(
				new HoaDon(
						105,
						dt6,
						dsNhanVien.get(1),
						dsKhachHang.get(4),
						dsCuaHang.get(1)
						));
		Date dt7 = new Date(04/10/2021);
		dsHoaDon.add(
				new HoaDon(
						106,
						dt7,
						dsNhanVien.get(5),
						dsKhachHang.get(2),
						dsCuaHang.get(1)
						));
		Date dt8 = new Date(05/11/2021);
		dsHoaDon.add(
				new HoaDon(
						107,
						dt8,
						dsNhanVien.get(3),
						dsKhachHang.get(3),
						dsCuaHang.get(1)
						));
		Date dt9 = new Date(06/12/2021);
		dsHoaDon.add(
				new HoaDon(
						108,
						dt9,
						dsNhanVien.get(4),
						dsKhachHang.get(4),
						dsCuaHang.get(2)
						));
		Date dt10 = new Date(07/01/2021);
		dsHoaDon.add(
				new HoaDon(
						109,
						dt10,
						dsNhanVien.get(6),
						dsKhachHang.get(0),
						dsCuaHang.get(2)
						));
		Date dt11 = new Date(8/02/2021);
		dsHoaDon.add(
				new HoaDon(
						110,
						dt11,
						dsNhanVien.get(6),
						dsKhachHang.get(1),
						dsCuaHang.get(2)
						));
		
		return dsHoaDon;
	}
	public static List<ChiTietHoaDon> createDSChiTietHoaDon() {
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(6),
						2,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(0),
						1,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(1),
						5,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(2),
						3,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(3),
						4,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(4),
						1,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(0),
						dsSanPham.get(5),
						1,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(0),
						2,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(6),
						4,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(7),
						8,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(8),
						9,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(2),
						2,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(3),
						3,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(4),
						1,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(1),
						dsSanPham.get(5),
						2,
						20));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(0),
						4,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(1),
						3,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(2),
						6,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(3),
						7,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(4),
						9,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(5),
						10,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(2),
						dsSanPham.get(6),
						1,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(3),
						dsSanPham.get(0),
						9,
						30));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(3),
						dsSanPham.get(1),
						8,
						30));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(3),
						dsSanPham.get(2),
						7,
						30));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(3),
						dsSanPham.get(3),
						6,
						30));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(4),
						dsSanPham.get(4),
						5,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(4),
						dsSanPham.get(5),
						4,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(4),
						dsSanPham.get(6),
						3,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(5),
						dsSanPham.get(7),
						1,
						35));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(5),
						dsSanPham.get(8),
						3,
						35));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(5),
						dsSanPham.get(9),
						4,
						35));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(5),
						dsSanPham.get(0),
						7,
						35));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(6),
						dsSanPham.get(9),
						20,
						10));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(3),
						dsSanPham.get(1),
						8,
						30));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(7),
						dsSanPham.get(0),
						1,
						0));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(7),
						dsSanPham.get(2),
						2,
						0));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(8),
						dsSanPham.get(10),
						1,
						15));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(8),
						dsSanPham.get(11),
						2,
						15));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(8),
						dsSanPham.get(12),
						3,
						15));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(8),
						dsSanPham.get(13),
						4,
						15));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(8),
						dsSanPham.get(14),
						5,
						15));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(9),
						dsSanPham.get(15),
						6,
						13));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(9),
						dsSanPham.get(16),
						7,
						13));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(9),
						dsSanPham.get(17),
						8,
						13));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(9),
						dsSanPham.get(18),
						9,
						13));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(9),
						dsSanPham.get(19),
						10,
						13));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(9),
						dsSanPham.get(20),
						11,
						13));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(10),
						dsSanPham.get(21),
						12,
						40));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(10),
						dsSanPham.get(22),
						13,
						40));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(10),
						dsSanPham.get(23),
						14,
						40));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(10),
						dsSanPham.get(10),
						15,
						40));
		dsChiTietHoaDon.add(
				new ChiTietHoaDon(
						dsHoaDon.get(10),
						dsSanPham.get(11),
						16,
						40));
		return dsChiTietHoaDon;
	}
	 
	// Phân bài của Đoàn Quốc Việt 19110314
	// Câu 1: Xuất ra thông tin các sản phẩm có giá từ 15.000.000 đồng đến 20.000.000 đồng là Laptop
	public static void Cau1() {
		var sanPhamTren10TrDuoi20Trs = dsSanPham
				.stream()
				.filter(c->c.getDonGia() > 10000000
						&& c.getDonGia() < 20000000
						&& c.getLoaiHang().getIDLoaiHang() == 1 )
				.collect(Collectors.toList());
		System.out.println("Câu 1: Danh sách thông tin các sản phẩm có giá từ 15.000.000 đồng đến 20.000.000 đồng là Laptop là: ");
		for (SanPham sanPhamTren10TrDuoi20Tr : sanPhamTren10TrDuoi20Trs) {
			System.out.println("Sản phẩm: " + sanPhamTren10TrDuoi20Tr.getTenSanPham());
			System.out.println("Đơn giá: " + (int)sanPhamTren10TrDuoi20Tr.getDonGia());
		}
		System.out.println("---------------------------------------------------------");
	}
	
	// Câu 2: Tính số lượng sản phẩm trung bình của mỗi kho
	public static void Cau2() {
		int dem = 0, tong = 0;
		var slKhos = dsKho
				.stream()
				.map(Kho::getSoLuong)
				.collect(Collectors.toList());
		for (Integer slKho : slKhos) {
			dem++;
			tong+= slKho;
		}
		int tb = tong / dem;
		System.out.println("Câu 2: Số lượng sản phẩm trung bình của mỗi kho là: " + tb + " sản phẩm.");
		System.out.println("---------------------------------------------------------");
	}
	
	
	 public static void Cau3() {
		 
		 var lsLuongThangs = dsNhanVien
				 .stream()
				 .map (NhanVien::getLuongThang)
				 .sorted()
				 .collect(Collectors.toList());
		 System.out.println("Câu 3: Xếp lương tháng của nhân viên theo chiều tăng dần: ");
		 for (double lsLuongThang : lsLuongThangs) {
				System.out.println("Lương tháng: " + (int)lsLuongThang + " đồng.");
			}
		
	 }
		 /*List<NhanVien> NhanVienLonTuoiNhat = dsNhanVien
				 .stream() 
				 .filter(nhanvien -> nhanvien.getNgaysinh().equals(ngaySinhNhoNhat))
				 .collect(Collectors.toList()); 
		 NhanVienLonTuoiNhat.stream().forEach(nhanvien-> System.out.println(nhanvien)); 
				 }*/
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		createDSLoaiHang();
		createdsNhaCungCap();
		createDSKhachHang();
		createDSCuaHang();
		createDSSanPham();
		createDSNhanVien();
		createDSThanNhan();
		createDSHoaDon();
		createDSKho();
		createDSChiTietHoaDon();
		Cau1();
		Cau2();
		Cau3();
	}

}
