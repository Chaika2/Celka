/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import java.io.OutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rpK_2
extends PrintStream {
    protected static final Logger id_class = LogManager.getLogger();
    protected final String id_break;

    public rpK_2(String string, OutputStream outputStream) {
        super(outputStream);
        this.id_break = string;
    }

    @Override
    public void println(String string) {
        this.id_class(string);
    }

    @Override
    public void println(Object object) {
        this.id_class(String.valueOf(object));
    }

    protected void id_class(String string) {
        id_class.info("[{}]: {}", (Object)this.id_break, (Object)string);
    }
}

