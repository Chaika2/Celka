/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rqu_3;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnN_2 {
    private static final Logger id_class = LogManager.getLogger();
    private final Path id_break;
    private final boolean id_byte;

    private void id_byte() {
        if (!rqu_3.id_byte) {
            try (OutputStream outputStream = Files.newOutputStream(this.id_break, new OpenOption[0]);){
                Properties properties = new Properties();
                properties.setProperty("eula", "false");
                properties.store(outputStream, "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula).");
            }
            catch (Exception exception) {
                id_class.warn("Failed to save {}", (Object)this.id_break, (Object)exception);
            }
        }
    }

    public rnN_2(Path path) {
        this.id_break = path;
        this.id_byte = rqu_3.id_byte || this.id_break();
    }

    public boolean id_class() {
        return this.id_byte;
    }

    private boolean id_break() {
        boolean bl;
        block8: {
            InputStream inputStream = Files.newInputStream(this.id_break, new OpenOption[0]);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                bl = Boolean.parseBoolean(properties.getProperty("eula", "false"));
                if (inputStream == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    id_class.warn("Failed to load {}", (Object)this.id_break);
                    this.id_byte();
                    return false;
                }
            }
            inputStream.close();
        }
        return bl;
    }
}

