/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Jo_1;
import celestial.rCR;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.xc_3;
import com.google.common.collect.Lists;
import java.util.List;

public class WJ {
    private final rYB id_class;
    private final rfH_2 id_break;
    private final Jo_1 id_byte;
    private xc_3 id_protected;
    private final boolean id_throws;
    private final List<rfH_2> id_case = Lists.newArrayList();

    private void id_byte(WJ wJ) {
        this.id_case.add(wJ.id_break);
        rfH_2 rfH_22 = this.id_break.id_private();
        rfH_2 rfH_23 = this.id_break.id_protected();
        rfH_2 rfH_24 = this.id_break.id_byte();
        rfH_2 rfH_25 = this.id_break.id_extends();
        boolean bl = this.id_byte(rfH_22);
        boolean bl2 = this.id_byte(rfH_23);
        boolean bl3 = this.id_byte(rfH_24);
        boolean bl4 = this.id_byte(rfH_25);
        rCR rCR2 = null;
        if (bl || bl2) {
            rCR2 = rCR.NORTH_SOUTH;
        }
        if (bl3 || bl4) {
            rCR2 = rCR.EAST_WEST;
        }
        if (!this.id_throws) {
            if (bl2 && bl4 && !bl && !bl3) {
                rCR2 = rCR.SOUTH_EAST;
            }
            if (bl2 && bl3 && !bl && !bl4) {
                rCR2 = rCR.SOUTH_WEST;
            }
            if (bl && bl3 && !bl2 && !bl4) {
                rCR2 = rCR.NORTH_WEST;
            }
            if (bl && bl4 && !bl2 && !bl3) {
                rCR2 = rCR.NORTH_EAST;
            }
        }
        if (rCR2 == rCR.NORTH_SOUTH) {
            if (Jo_1.id_class(this.id_class, rfH_22.id_final())) {
                rCR2 = rCR.ASCENDING_NORTH;
            }
            if (Jo_1.id_class(this.id_class, rfH_23.id_final())) {
                rCR2 = rCR.ASCENDING_SOUTH;
            }
        }
        if (rCR2 == rCR.EAST_WEST) {
            if (Jo_1.id_class(this.id_class, rfH_25.id_final())) {
                rCR2 = rCR.ASCENDING_EAST;
            }
            if (Jo_1.id_class(this.id_class, rfH_24.id_final())) {
                rCR2 = rCR.ASCENDING_WEST;
            }
        }
        if (rCR2 == null) {
            rCR2 = rCR.NORTH_SOUTH;
        }
        this.id_protected = (xc_3)this.id_protected.id_class(this.id_byte.id_implements(), rCR2);
        this.id_class.id_class(this.id_break, this.id_protected, 3);
    }

    public xc_3 id_byte() {
        return this.id_protected;
    }

    private boolean id_byte(rfH_2 rfH_22) {
        for (int i = 0; i < this.id_case.size(); ++i) {
            rfH_2 rfH_23 = this.id_case.get(i);
            if (rfH_23.b_() != rfH_22.b_() || rfH_23.d_() != rfH_22.d_()) continue;
            return true;
        }
        return false;
    }

    public WJ(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class = rYB2;
        this.id_break = rfH_22;
        this.id_protected = xc_32;
        this.id_byte = (Jo_1)xc_32.id_break();
        rCR rCR2 = xc_32.id_byte(this.id_byte.id_implements());
        this.id_throws = this.id_byte.id_break();
        this.id_class(rCR2);
    }

    public WJ id_class(boolean bl, boolean bl2, rCR rCR2) {
        boolean bl3;
        boolean bl4;
        rfH_2 rfH_22 = this.id_break.id_private();
        rfH_2 rfH_23 = this.id_break.id_protected();
        rfH_2 rfH_24 = this.id_break.id_byte();
        rfH_2 rfH_25 = this.id_break.id_extends();
        boolean bl5 = this.id_protected(rfH_22);
        boolean bl6 = this.id_protected(rfH_23);
        boolean bl7 = this.id_protected(rfH_24);
        boolean bl8 = this.id_protected(rfH_25);
        rCR rCR3 = null;
        boolean bl9 = bl5 || bl6;
        boolean bl10 = bl4 = bl7 || bl8;
        if (bl9 && !bl4) {
            rCR3 = rCR.NORTH_SOUTH;
        }
        if (bl4 && !bl9) {
            rCR3 = rCR.EAST_WEST;
        }
        boolean bl11 = bl6 && bl8;
        boolean bl12 = bl6 && bl7;
        boolean bl13 = bl5 && bl8;
        boolean bl14 = bl3 = bl5 && bl7;
        if (!this.id_throws) {
            if (bl11 && !bl5 && !bl7) {
                rCR3 = rCR.SOUTH_EAST;
            }
            if (bl12 && !bl5 && !bl8) {
                rCR3 = rCR.SOUTH_WEST;
            }
            if (bl3 && !bl6 && !bl8) {
                rCR3 = rCR.NORTH_WEST;
            }
            if (bl13 && !bl6 && !bl7) {
                rCR3 = rCR.NORTH_EAST;
            }
        }
        if (rCR3 == null) {
            if (bl9 && bl4) {
                rCR3 = rCR2;
            } else if (bl9) {
                rCR3 = rCR.NORTH_SOUTH;
            } else if (bl4) {
                rCR3 = rCR.EAST_WEST;
            }
            if (!this.id_throws) {
                if (bl) {
                    if (bl11) {
                        rCR3 = rCR.SOUTH_EAST;
                    }
                    if (bl12) {
                        rCR3 = rCR.SOUTH_WEST;
                    }
                    if (bl13) {
                        rCR3 = rCR.NORTH_EAST;
                    }
                    if (bl3) {
                        rCR3 = rCR.NORTH_WEST;
                    }
                } else {
                    if (bl3) {
                        rCR3 = rCR.NORTH_WEST;
                    }
                    if (bl13) {
                        rCR3 = rCR.NORTH_EAST;
                    }
                    if (bl12) {
                        rCR3 = rCR.SOUTH_WEST;
                    }
                    if (bl11) {
                        rCR3 = rCR.SOUTH_EAST;
                    }
                }
            }
        }
        if (rCR3 == rCR.NORTH_SOUTH) {
            if (Jo_1.id_class(this.id_class, rfH_22.id_final())) {
                rCR3 = rCR.ASCENDING_NORTH;
            }
            if (Jo_1.id_class(this.id_class, rfH_23.id_final())) {
                rCR3 = rCR.ASCENDING_SOUTH;
            }
        }
        if (rCR3 == rCR.EAST_WEST) {
            if (Jo_1.id_class(this.id_class, rfH_25.id_final())) {
                rCR3 = rCR.ASCENDING_EAST;
            }
            if (Jo_1.id_class(this.id_class, rfH_24.id_final())) {
                rCR3 = rCR.ASCENDING_WEST;
            }
        }
        if (rCR3 == null) {
            rCR3 = rCR2;
        }
        this.id_class(rCR3);
        this.id_protected = (xc_3)this.id_protected.id_class(this.id_byte.id_implements(), rCR3);
        if (bl2 || this.id_class.id_byte(this.id_break) != this.id_protected) {
            this.id_class.id_class(this.id_break, this.id_protected, 3);
            for (int i = 0; i < this.id_case.size(); ++i) {
                WJ wJ = this.id_break(this.id_case.get(i));
                if (wJ == null) continue;
                wJ.id_protected();
                if (!wJ.id_break(this)) continue;
                wJ.id_byte(this);
            }
        }
        return this;
    }

    private void id_class(rCR rCR2) {
        this.id_case.clear();
        switch (rCR2) {
            case NORTH_SOUTH: {
                this.id_case.add(this.id_break.id_private());
                this.id_case.add(this.id_break.id_protected());
                break;
            }
            case EAST_WEST: {
                this.id_case.add(this.id_break.id_byte());
                this.id_case.add(this.id_break.id_extends());
                break;
            }
            case ASCENDING_EAST: {
                this.id_case.add(this.id_break.id_byte());
                this.id_case.add(this.id_break.id_extends().id_final());
                break;
            }
            case ASCENDING_WEST: {
                this.id_case.add(this.id_break.id_byte().id_final());
                this.id_case.add(this.id_break.id_extends());
                break;
            }
            case ASCENDING_NORTH: {
                this.id_case.add(this.id_break.id_private().id_final());
                this.id_case.add(this.id_break.id_protected());
                break;
            }
            case ASCENDING_SOUTH: {
                this.id_case.add(this.id_break.id_private());
                this.id_case.add(this.id_break.id_protected().id_final());
                break;
            }
            case SOUTH_EAST: {
                this.id_case.add(this.id_break.id_extends());
                this.id_case.add(this.id_break.id_protected());
                break;
            }
            case SOUTH_WEST: {
                this.id_case.add(this.id_break.id_byte());
                this.id_case.add(this.id_break.id_protected());
                break;
            }
            case NORTH_WEST: {
                this.id_case.add(this.id_break.id_byte());
                this.id_case.add(this.id_break.id_private());
                break;
            }
            case NORTH_EAST: {
                this.id_case.add(this.id_break.id_extends());
                this.id_case.add(this.id_break.id_private());
            }
        }
    }

    public List<rfH_2> id_class() {
        return this.id_case;
    }

    private boolean id_class(rfH_2 rfH_22) {
        return Jo_1.id_class(this.id_class, rfH_22) || Jo_1.id_class(this.id_class, rfH_22.id_final()) || Jo_1.id_class(this.id_class, rfH_22.id_break());
    }

    private boolean id_class(WJ wJ) {
        return this.id_byte(wJ.id_break);
    }

    protected int id_break() {
        int n = 0;
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            if (!this.id_class(this.id_break.id_break(rpr_32))) continue;
            ++n;
        }
        return n;
    }

    private boolean id_break(WJ wJ) {
        return this.id_class(wJ) || this.id_case.size() != 2;
    }

    private WJ id_break(rfH_2 rfH_22) {
        xc_3 xc_32 = this.id_class.id_byte(rfH_22);
        if (Jo_1.id_catch(xc_32)) {
            return new WJ(this.id_class, rfH_22, xc_32);
        }
        rfH_2 rfH_23 = rfH_22.id_final();
        xc_32 = this.id_class.id_byte(rfH_23);
        if (Jo_1.id_catch(xc_32)) {
            return new WJ(this.id_class, rfH_23, xc_32);
        }
        rfH_23 = rfH_22.id_break();
        xc_32 = this.id_class.id_byte(rfH_23);
        return Jo_1.id_catch(xc_32) ? new WJ(this.id_class, rfH_23, xc_32) : null;
    }

    private boolean id_protected(rfH_2 rfH_22) {
        WJ wJ = this.id_break(rfH_22);
        if (wJ == null) {
            return false;
        }
        wJ.id_protected();
        return wJ.id_break(this);
    }

    private void id_protected() {
        for (int i = 0; i < this.id_case.size(); ++i) {
            WJ wJ = this.id_break(this.id_case.get(i));
            if (wJ != null && wJ.id_class(this)) {
                this.id_case.set(i, wJ.id_break);
                continue;
            }
            this.id_case.remove(i--);
        }
    }
}

