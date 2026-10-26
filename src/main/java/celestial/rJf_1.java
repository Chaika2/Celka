/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ji_1;
import celestial.eA_2;
import celestial.ev_3;
import celestial.rJP;
import celestial.rXy_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rgN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rls_3;
import celestial.rpj_3;
import celestial.rpq_3;
import celestial.rxy_3;
import celestial.xc_3;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rJf_1
extends rXy_1 {
    private static final Logger id_catch = LogManager.getLogger();
    private int id_private;
    private String id_implements;
    private final rpj_3 id_finally = rpj_3.id_class();

    public rJf_1(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJf_1(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_private, n, rhz_32, rpq_32);
        this.id_class(this.id_finally);
    }

    @Override
    public void id_class() {
        rdn_3 rdn_32 = this.id_break.id_extends(0);
        this.id_finally.id_class(1);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (rdn_32.id_class()) {
            this.id_class.id_break(0, rdn_3.id_break);
            this.id_finally.id_class(0);
        } else {
            int n4;
            rdn_3 rdn_33 = rdn_32.id_implements();
            rdn_3 rdn_34 = this.id_break.id_extends(1);
            Map<ev_3, Integer> map = eA_2.id_class(rdn_33);
            n2 = n2 + rdn_32.id_instanceof() + (rdn_34.id_class() ? 0 : rdn_34.id_instanceof());
            this.id_private = 0;
            if (!rdn_34.id_class()) {
                int n5 = n4 = rdn_34.id_break() == rdy_3.dm && !rxy_3.id_protected(rdn_34).isEmpty() ? 1 : 0;
                if (rdn_33.id_throws() && rdn_33.id_break().id_class(rdn_32, rdn_34)) {
                    int n6;
                    int n7 = Math.min(rdn_33.id_catch(), rdn_33.id_private() / 4);
                    if (n7 <= 0) {
                        this.id_class.id_break(0, rdn_3.id_break);
                        this.id_finally.id_class(0);
                        return;
                    }
                    for (n6 = 0; n7 > 0 && n6 < rdn_34.id_char(); ++n6) {
                        int n8 = rdn_33.id_catch() - n7;
                        rdn_33.id_break(n8);
                        ++n;
                        n7 = Math.min(rdn_33.id_catch(), rdn_33.id_private() / 4);
                    }
                    this.id_private = n6;
                } else {
                    int n9;
                    int n10;
                    if (!(n4 != 0 || rdn_33.id_break() == rdn_34.id_break() && rdn_33.id_throws())) {
                        this.id_class.id_break(0, rdn_3.id_break);
                        this.id_finally.id_class(0);
                        return;
                    }
                    if (rdn_33.id_throws() && n4 == 0) {
                        int n11 = rdn_32.id_private() - rdn_32.id_catch();
                        n10 = rdn_34.id_private() - rdn_34.id_catch();
                        n9 = n10 + rdn_33.id_private() * 12 / 100;
                        int n12 = n11 + n9;
                        int n13 = rdn_33.id_private() - n12;
                        if (n13 < 0) {
                            n13 = 0;
                        }
                        if (n13 < rdn_33.id_catch()) {
                            rdn_33.id_break(n13);
                            n += 2;
                        }
                    }
                    Map<ev_3, Integer> map2 = eA_2.id_class(rdn_34);
                    n10 = 0;
                    n9 = 0;
                    for (ev_3 ev_32 : map2.keySet()) {
                        int n14;
                        if (ev_32 == null) continue;
                        int n15 = map.getOrDefault(ev_32, 0);
                        n14 = n15 == (n14 = map2.get(ev_32).intValue()) ? n14 + 1 : Math.max(n14, n15);
                        boolean bl = ev_32.id_class(rdn_32);
                        if (((rhx_3)this.id_protected.id_implements[18]).id_protected || rdn_32.id_break() == rdy_3.dm) {
                            bl = true;
                        }
                        for (ev_3 ev_33 : map.keySet()) {
                            if (ev_33 == ev_32 || ev_32.id_break(ev_33)) continue;
                            bl = false;
                            ++n;
                        }
                        if (!bl) {
                            n9 = 1;
                            continue;
                        }
                        n10 = 1;
                        if (n14 > ev_32.id_class()) {
                            n14 = ev_32.id_class();
                        }
                        map.put(ev_32, n14);
                        int n16 = 0;
                        switch (ev_32.id_protected()) {
                            case COMMON: {
                                n16 = 1;
                                break;
                            }
                            case UNCOMMON: {
                                n16 = 2;
                                break;
                            }
                            case RARE: {
                                n16 = 4;
                                break;
                            }
                            case VERY_RARE: {
                                n16 = 8;
                            }
                        }
                        if (n4 != 0) {
                            n16 = Math.max(1, n16 / 2);
                        }
                        n += n16 * n14;
                        if (rdn_32.id_char() <= 1) continue;
                        n = 40;
                    }
                    if (n9 != 0 && n10 == 0) {
                        this.id_class.id_break(0, rdn_3.id_break);
                        this.id_finally.id_class(0);
                        return;
                    }
                }
            }
            if (StringUtils.isBlank((CharSequence)this.id_implements)) {
                if (rdn_32.id_this()) {
                    n3 = 1;
                    n += n3;
                    rdn_33.id_super();
                }
            } else if (!this.id_implements.equals(rdn_32.id_continue().getString())) {
                n3 = 1;
                n += n3;
                rdn_33.id_class(new rgN_2(this.id_implements));
            }
            this.id_finally.id_class(n2 + n);
            if (n <= 0) {
                rdn_33 = rdn_3.id_break;
            }
            if (n3 == n && n3 > 0 && this.id_finally.id_break() >= 40) {
                this.id_finally.id_class(39);
            }
            if (this.id_finally.id_break() >= 40 && !((rhx_3)this.id_protected.id_implements[18]).id_protected) {
                rdn_33 = rdn_3.id_break;
            }
            if (!rdn_33.id_class()) {
                n4 = rdn_33.id_instanceof();
                if (!rdn_34.id_class() && n4 < rdn_34.id_instanceof()) {
                    n4 = rdn_34.id_instanceof();
                }
                if (n3 != n || n3 == 0) {
                    n4 = rJf_1.id_protected(n4);
                }
                rdn_33.id_byte(n4);
                eA_2.id_class(map, rdn_33);
            }
            this.id_class.id_break(0, rdn_33);
            this.id_native();
        }
    }

    public void id_class(String string) {
        this.id_implements = string;
        if (this.id_class(2).id_break()) {
            rdn_3 rdn_32 = this.id_class(2).id_class();
            if (StringUtils.isBlank((CharSequence)string)) {
                rdn_32.id_super();
            } else {
                rdn_32.id_class(new rgN_2(this.id_implements));
            }
        }
        this.id_class();
    }

    @Override
    protected boolean id_class(rhd_3 rhd_32, boolean bl) {
        return (((rhx_3)rhd_32.id_implements[18]).id_protected || (Integer)rhd_32.id_implements[19] >= this.id_finally.id_break()) && this.id_finally.id_break() > 0;
    }

    @Override
    protected boolean id_class(xc_3 xc_32) {
        return xc_32.id_class(rls_3.id_long);
    }

    @Override
    protected rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rhd_32.id_super(-this.id_finally.id_break());
        }
        this.id_break.id_break(0, rdn_3.id_break);
        if (this.id_private > 0) {
            rdn_3 rdn_33 = this.id_break.id_extends(1);
            if (!rdn_33.id_class() && rdn_33.id_char() > this.id_private) {
                rdn_33.id_catch(this.id_private);
                this.id_break.id_break(1, rdn_33);
            } else {
                this.id_break.id_break(1, rdn_3.id_break);
            }
        } else {
            this.id_break.id_break(1, rdn_3.id_break);
        }
        this.id_finally.id_class(0);
        this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            xc_3 xc_32 = rYB2.id_byte((rfH_2)rfH_22);
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected && xc_32.id_class(rls_3.id_long) && rhd_32.Sa().nextFloat() < 0.12f) {
                xc_3 xc_33 = Ji_1.id_private(xc_32);
                if (xc_33 == null) {
                    rYB2.id_class((rfH_2)rfH_22, false);
                    rYB2.id_byte(1029, (rfH_2)rfH_22, 0);
                } else {
                    rYB2.id_class((rfH_2)rfH_22, xc_33, 2);
                    rYB2.id_byte(1030, (rfH_2)rfH_22, 0);
                }
            } else {
                rYB2.id_byte(1030, (rfH_2)rfH_22, 0);
            }
        });
        return rdn_32;
    }

    public int id_break() {
        return this.id_finally.id_break();
    }

    public static int id_protected(int n) {
        return n * 2 + 1;
    }
}

