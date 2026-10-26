/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rnv_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class rnF_2
extends Thread {
    public final /* synthetic */ rnv_3 id_class;

    public rnF_2(rnv_3 rnv_32, String string) {
        this.id_class = rnv_32;
        super(string);
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        try {
            String string;
            while (!this.id_class.J() && this.id_class.id_synchronized() && (string = bufferedReader.readLine()) != null) {
                this.id_class.id_class(string, this.id_class.j());
            }
        }
        catch (IOException iOException) {
            rnv_3.id_finally.error("Exception handling console input", (Throwable)iOException);
        }
    }
}

