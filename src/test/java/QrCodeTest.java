import com.fxs.demo.QRCodeUtil;

/**
 * @author fangxs
 * @className QrCodeTest
 * @date 2019/9/9 15:46
 * @description
 **/
public class QrCodeTest {

    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容，可以直接放入一个链接，扫描二位码可以直接链接到所在网址
        //String text = "https://www.baidu.com";
        String text = "TEST网址";
        // 嵌入二维码的图片路径
        String imgPath = "D:/StudyCode/picture/test2.jpg";
        // 生成的二维码的路径及名称
        String destPath = "D:/StudyCode/picture/jam.jpg";
        // 生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

    }

}
