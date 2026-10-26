/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmk_3;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.ryK_2;
import celestial.ryo_3;
import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class rmc_3
implements ruS_2<rmk_3> {
    private byte[] id_class = new byte[0];
    private byte[] id_break = new byte[0];

    public rmc_3() {
    }

    public rmc_3(SecretKey secretKey, PublicKey publicKey, byte[] byArray) throws ryo_3 {
        this.id_class = ryK_2.id_class(publicKey, secretKey.getEncoded());
        this.id_break = ryK_2.id_class(publicKey, byArray);
    }

    public SecretKey id_class(PrivateKey privateKey) throws ryo_3 {
        return ryK_2.id_class(privateKey, this.id_class);
    }

    @Override
    public void id_class(rmk_3 rmk_32) {
        rmk_32.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class();
        this.id_break = ruu_32.id_class();
    }

    public byte[] id_break(PrivateKey privateKey) throws ryo_3 {
        return ryK_2.id_break(privateKey, this.id_break);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
    }
}

