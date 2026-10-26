/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rCd_1;
import celestial.rCx_1;
import celestial.rnD_2;
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class rnU_2
extends rCx_1<String, rnD_2> {
    private String id_byte(SocketAddress socketAddress) {
        String string = socketAddress.toString();
        if (string.contains("/")) {
            string = string.substring(string.indexOf(47) + 1);
        }
        if (string.contains(":")) {
            string = string.substring(0, string.indexOf(58));
        }
        return string;
    }

    public rnU_2(File file) {
        super(file);
    }

    public boolean id_class(String string) {
        return this.id_protected(string);
    }

    @Override
    protected rCd_1<String> id_class(JsonObject jsonObject) {
        return new rnD_2(jsonObject);
    }

    public boolean id_class(SocketAddress socketAddress) {
        String string = this.id_byte(socketAddress);
        return this.id_protected(string);
    }

    @Override
    public rnD_2 id_break(SocketAddress socketAddress) {
        String string = this.id_byte(socketAddress);
        return (rnD_2)this.id_break(string);
    }
}

