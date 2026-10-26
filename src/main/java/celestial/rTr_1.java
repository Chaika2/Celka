/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqi_3;
import java.net.URL;

public final class rTr_1
extends rqi_3 {
    @Override
    protected String[] id_break(URL uRL) {
        return new String[]{"rundll32", "url.dll,FileProtocolHandler", uRL.toString()};
    }
}

