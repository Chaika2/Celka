/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpK_2;
import java.io.OutputStream;

public class rnk_3
extends rpK_2 {
    public rnk_3(String string, OutputStream outputStream) {
        super(string, outputStream);
    }

    @Override
    protected void id_class(String string) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElementArray[Math.min(3, stackTraceElementArray.length)];
        id_class.info("[{}]@.({}:{}): {}", (Object)this.id_break, (Object)stackTraceElement.getFileName(), (Object)stackTraceElement.getLineNumber(), (Object)string);
    }
}

