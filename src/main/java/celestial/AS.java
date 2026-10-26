/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class AS
extends Authenticator {
    public final /* synthetic */ String id_class;
    public final /* synthetic */ String id_break;

    public AS(String string, String string2) {
        this.id_class = string;
        this.id_break = string2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.id_class, this.id_break.toCharArray());
    }
}

