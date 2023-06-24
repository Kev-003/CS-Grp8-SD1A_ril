package res.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FontManager {

    String[] fontPaths = {
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaUltrabold_2.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaBlack.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaBlackItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaBold.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaBoldItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaHeavy.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaHeavyItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaLight.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaLightItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaMedium.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaMediumItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaRegular.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaRegularItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaSemibold.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaSemiboldItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaThin.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaThinItalics.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaUltrabold.ttf",
        "C:\\Users\\Jannette\\Documents\\NetBeansProjects\\CS-Grp8-SD1A_ril\\src\\main\\java\\res\\fonts\\QuinoaUltraboldItalics.ttf"

    };

    public Font registerFonts(int i) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(fontPaths[i]));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
        return null;

    }

}
