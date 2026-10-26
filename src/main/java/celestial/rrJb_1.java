/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.Qj_1;
import celestial.jI_2;
import celestial.rgN_2;
import celestial.rrJM;
import celestial.rrXi_1;
import celestial.rrba_3;
import celestial.rrbb_3;
import celestial.vm_3;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Random;

public class rrJb_1
extends rrJM {
    private final vm_3 id_class;
    private String id_private;
    private long id_implements;
    private String id_finally;
    private rrXi_1 id_else;

    public rrJb_1(vm_3 vm_32) {
        super(new rgN_2(jI_2.id_class("of.options.capeOF.title", new Object[0])));
        this.id_class = vm_32;
    }

    private void id_class(String string, long l) {
        this.id_private = string;
        this.id_implements = System.currentTimeMillis() + l;
        this.id_class((String)null);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        rrJb_1.id_class(ml_1, this.id_case, this.id_extends, this.id_package / 2, 20, 0xFFFFFF);
        if (this.id_private != null) {
            rrJb_1.id_class(ml_1, this.id_case, this.id_private, this.id_package / 2, this.id_int / 6 + 60, 0xFFFFFF);
            if (System.currentTimeMillis() > this.id_implements) {
                this.id_private = null;
                this.id_class((String)null);
            }
        }
        super.id_class(ml_1, n, n2, f);
    }

    public void id_class(String string) {
        this.id_finally = string;
        this.id_else.id_new = string != null;
    }

    @Override
    protected void id_break(LZ lZ) {
        if (lZ instanceof rrXi_1) {
            rrXi_1 rrXi_12 = (rrXi_1)lZ;
            if (rrXi_12.id_int) {
                if (rrXi_12.id_class == 200) {
                    this.id_volatile.id_break(this.id_class);
                }
                if (rrXi_12.id_class == 210) {
                    try {
                        String string = this.id_volatile.id_while().id_throws().getName();
                        String string2 = this.id_volatile.id_while().id_throws().getId().toString().replace("-", "");
                        String string3 = this.id_volatile.id_while().id_protected();
                        Random random = new Random();
                        Random random2 = new Random(System.identityHashCode(new Object()));
                        BigInteger bigInteger = new BigInteger(128, random);
                        BigInteger bigInteger2 = new BigInteger(128, random2);
                        BigInteger bigInteger3 = bigInteger.xor(bigInteger2);
                        String string4 = bigInteger3.toString(16);
                        this.id_volatile.r().joinServer(this.id_volatile.id_while().id_throws(), string3, string4);
                        String string5 = "https://optifine.net/capeChange?u=" + string2 + "&n=" + string + "&s=" + string4;
                        boolean bl = rrbb_3.id_class(new URI(string5));
                        if (bl) {
                            this.id_class(rrba_3.id_class("of.message.capeOF.openEditor"), 10000L);
                        } else {
                            this.id_class(rrba_3.id_class("of.message.capeOF.openEditorError"), 10000L);
                            this.id_class(string5);
                        }
                    }
                    catch (InvalidCredentialsException invalidCredentialsException) {
                        rrbb_3.id_byte(jI_2.id_class("of.message.capeOF.error1", new Object[0]), jI_2.id_class("of.message.capeOF.error2", invalidCredentialsException.getMessage(), new Object[0]));
                        rrbb_3.id_protected("Mojang authentication failed");
                        rrbb_3.id_protected(((Object)((Object)invalidCredentialsException)).getClass().getName() + ": " + invalidCredentialsException.getMessage());
                    }
                    catch (Exception exception) {
                        rrbb_3.id_protected("Error opening OptiFine cape link");
                        rrbb_3.id_protected(exception.getClass().getName() + ": " + exception.getMessage());
                    }
                }
                if (rrXi_12.id_class == 220) {
                    this.id_class(rrba_3.id_class("of.message.capeOF.reloadCape"), 15000L);
                }
                if (rrXi_12.id_class == 230 && this.id_finally != null) {
                    ((Qj_1)this.id_volatile.id_class[23]).id_class(this.id_finally);
                }
            }
        }
    }

    @Override
    protected void v_() {
        int n = 0;
        this.id_class(new rrXi_1(210, this.id_package / 2 - 155, this.id_int / 6 + 24 * ((n += 2) >> 1), 150, 20, jI_2.id_class("of.options.capeOF.openEditor", new Object[0])));
        this.id_class(new rrXi_1(220, this.id_package / 2 - 155 + 160, this.id_int / 6 + 24 * (n >> 1), 150, 20, jI_2.id_class("of.options.capeOF.reloadCape", new Object[0])));
        this.id_else = new rrXi_1(230, this.id_package / 2 - 100, this.id_int / 6 + 24 * ((n += 6) >> 1), 200, 20, jI_2.id_class("of.options.capeOF.copyEditorLink", new Object[0]));
        this.id_else.id_new = this.id_finally != null;
        this.id_class(this.id_else);
        this.id_class(new rrXi_1(200, this.id_package / 2 - 100, this.id_int / 6 + 24 * ((n += 4) >> 1), jI_2.id_class("gui.done", new Object[0])));
    }
}

