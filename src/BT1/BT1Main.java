/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import BT1.CaNhan;
/**
 *
 * @author Pii
 */
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LopHoc lophoc = new LopHoc();
        HocSinh hs1 = new HocSinh("59CNTT3", "Công Nghệ Thông Tin ", "Nguyễn Ngọc Châu", 20, "Cam Ranh", "09277787095");
        HocSinh hs2 = new HocSinh("59CNTT3", "Công Nghệ Thực Phẩm", "Hồ Nguyễn Thanh Thiện", 21, "Nha Trang", "088324898");
        GiaoVien GV1 = new GiaoVien("59CNTT1", "Công Nghệ Điện Tử", "Võ Chí Thành", 19, "Nha Trang", "045684519");
        GiaoVien GV2 = new GiaoVien("58CNTT2", "Công Nghệ Phần Mềm", "Hoàng Hòa", 22, "Nha Trang", "061629415");
        
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        lophoc.themGVGD(GV1);
        lophoc.themGVGD(GV2);
        
        lophoc.inDSHS();
        lophoc.inDSGVGD();
    }
    
}
