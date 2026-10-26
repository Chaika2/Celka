/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.gB_2;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class gP_2
extends IOException {
    private final List<gB_2> id_class = Lists.newArrayList();
    private final String id_break;

    public gP_2(String string) {
        this.id_class.add(new gB_2());
        this.id_break = string;
    }

    public gP_2(String string, Throwable throwable) {
        super(throwable);
        this.id_class.add(new gB_2());
        this.id_break = string;
    }

    public static gP_2 id_class(Exception exception) {
        if (exception instanceof gP_2) {
            return (gP_2)exception;
        }
        String string = exception.getMessage();
        if (exception instanceof FileNotFoundException) {
            string = "File not found";
        }
        return new gP_2(string, exception);
    }

    public void id_class(String string) {
        this.id_class.get(0).id_class(string);
    }

    @Override
    public String getMessage() {
        return "Invalid " + this.id_class.get(this.id_class.size() - 1) + ": " + this.id_break;
    }

    public void id_break(String string) {
        this.id_class.get((int)0).id_class = string;
        this.id_class.add(0, new gB_2());
    }
}

