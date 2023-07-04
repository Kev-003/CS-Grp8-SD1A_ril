package res.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.FileInputStream;
import java.io.IOException;

public class FontManager {

    String[] fontPaths = {
        "src/main/java/res/fonts/QuinoaUltrabold_2.ttf",
        "src/main/java/res/fonts/QuinoaBlack.ttf",
        "src/main/java/res/fonts/QuinoaBlackItalics.ttf",
        "src/main/java/res/fonts/QuinoaBold.ttf",
        "src/main/java/res/fonts/QuinoaBoldItalics.ttf",
        "src/main/java/res/fonts/QuinoaHeavy.ttf",
        "src/main/java/res/fonts/QuinoaHeavyItalics.ttf",
        "src/main/java/res/fonts/QuinoaLight.ttf",
        "src/main/java/res/fonts/QuinoaLightItalics.ttf",
        "src/main/java/res/fonts/QuinoaMedium.ttf",
        "src/main/java/res/fonts/QuinoaMediumItalics.ttf",
        "src/main/java/res/fonts/QuinoaRegular.ttf",
        "src/main/java/res/fonts/QuinoaRegularItalics.ttf",
        "src/main/java/res/fonts/QuinoaSemibold.ttf",
        "src/main/java/res/fonts/QuinoaSemiboldItalics.ttf",
        "src/main/java/res/fonts/QuinoaThin.ttf",
        "src/main/java/res/fonts/QuinoaThinItalics.ttf",
        "src/main/java/res/fonts/QuinoaUltrabold.ttf",
        "src/main/java/res/fonts/QuinoaUltraboldItalics.ttf",
        "src/main/java/res/fonts/Febrero-Light.ttf",
        "src/main/java/res/fonts/Febrero-Regular.ttf"

    };

    public Font registerFonts(int i) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(fontPaths[i]));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
            return new Font("Roboto",Font.BOLD,11);
        }
    }

}
