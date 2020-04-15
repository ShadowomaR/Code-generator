import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QRCodeGenerateExample {
	private static final String QR_CODE_LOCATION = "C:\\Users\\SHADOW\\Documents\\Code generator/HelloQRCode.jpg";

	private static void generateQRCode(String text, int width, int height, String filePath)
			throws WriterException, IOException {

		QRCodeWriter writer = new QRCodeWriter();
		BitMatrix matrix = writer.encode(text, BarcodeFormat.QR_CODE, width, height);

		Path path = FileSystems.getDefault().getPath(filePath);
		MatrixToImageWriter.writeToPath(matrix, "JPG", path);
	}

	public static void main(String[] args) {
		try {
			generateQRCode("Hello!!!!", 350, 350, QR_CODE_LOCATION);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException ex) {
                Logger.getLogger(QRCodeGenerateExample.class.getName()).log(Level.SEVERE, null, ex);
            }
	}
}