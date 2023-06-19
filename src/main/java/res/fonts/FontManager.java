package res.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.FileInputStream;
import java.io.IOException;

public class FontManager {
    
    String[] fontPaths = {
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaUltrabold_2.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaBlack.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaBlackItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaBold.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaBoldItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaHeavy.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaHeavyItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaLight.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaLightItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaMedium.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaMediumItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaRegular.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaRegularItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaSemibold.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\\fonts\\QuinoaSemiboldItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaThin.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaThinItalics.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaUltrabold.ttf",
        "C:\\Users\\User's\\Documents\\NetBeansProjects\\CS-Grp8-SD1A\\src\\res\\fonts\\QuinoaUltraboldItalics.ttf"
    };

    public Font registerFonts(int i) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(fontPaths[i]));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            //Handle exception
        }
        return null;
    }
    
}
