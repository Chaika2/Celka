/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.rcW_2;
import celestial.rcd_3;
import celestial.rgP_2;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DU
implements DT {
    private static final Logger id_break = LogManager.getLogger();
    private final DA id_byte;

    public DU(DA dA) {
        this.id_byte = dA;
    }

    public static Path id_class(Path path, String string, Path path2) {
        try {
            rcd_3 rcd_32 = rcW_2.id_class(Files.newInputStream(path, new OpenOption[0]));
            rgP_2 rgP_22 = rcd_32.id_class("    ", 0);
            String string2 = rgP_22.getString() + "\n";
            Path path3 = path2.resolve(string + ".snbt");
            Files.createDirectories(path3.getParent(), new FileAttribute[0]);
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path3, new OpenOption[0]);){
                bufferedWriter.write(string2);
            }
            id_break.info("Converted {} from NBT to SNBT", (Object)string);
            return path3;
        }
        catch (IOException iOException) {
            id_break.error("Couldn't convert {} from NBT to SNBT at {}", (Object)string, (Object)path, (Object)iOException);
            return null;
        }
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        Path path2 = this.id_byte.id_break();
        for (Path path4 : this.id_byte.id_class()) {
            Files.walk(path4, new FileVisitOption[0]).filter(path -> path.toString().endsWith(".nbt")).forEach(path3 -> DU.id_class(path3, this.id_class(path4, (Path)path3), path2));
        }
    }

    private String id_class(Path path, Path path2) {
        String string = path.relativize(path2).toString().replaceAll("\\\\", "/");
        return string.substring(0, string.length() - ".nbt".length());
    }

    @Override
    public String id_class() {
        return "NBT to SNBT";
    }
}

