/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package celestial;

import celestial.At_1;
import celestial.rRl_1;
import celestial.rgP_2;
import celestial.rhN_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.rvY_2;
import celestial.rvo_3;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.util.List;

public class rvg_3
implements ruS_2<At_1> {
    private rvY_2 id_class;
    private final List<rvo_3> id_break = Lists.newArrayList();

    public rvY_2 id_byte() {
        return this.id_class;
    }

    public rvg_3() {
    }

    public rvg_3(rvY_2 rvY_22, Iterable<rhN_2> iterable) {
        this.id_class = rvY_22;
        for (rhN_2 rhN_22 : iterable) {
            this.id_break.add(new rvo_3(this, rhN_22.sv(), rhN_22.id_native, rhN_22.id_finally.id_break(), rhN_22.id_boolean()));
        }
    }

    public rvg_3(rvY_2 rvY_22, rhN_2 ... rhN_2Array) {
        this.id_class = rvY_22;
        for (rhN_2 rhN_22 : rhN_2Array) {
            this.id_break.add(new rvo_3(this, rhN_22.sv(), rhN_22.id_native, rhN_22.id_finally.id_break(), rhN_22.id_boolean()));
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("action", (Object)this.id_class).add("entries", this.id_break).toString();
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rvY_2.class);
        int n = ruu_32.id_case();
        for (int i = 0; i < n; ++i) {
            GameProfile gameProfile = null;
            int n2 = 0;
            rRl_1 rRl_12 = null;
            rgP_2 rgP_22 = null;
            switch (this.id_class) {
                case ADD_PLAYER: {
                    gameProfile = new GameProfile(ruu_32.id_private(), ruu_32.id_throws(16));
                    int n3 = ruu_32.id_case();
                    for (int j = 0; j < n3; ++j) {
                        String string = ruu_32.id_throws(Short.MAX_VALUE);
                        String string2 = ruu_32.id_throws(Short.MAX_VALUE);
                        if (ruu_32.readBoolean()) {
                            gameProfile.getProperties().put((Object)string, (Object)new Property(string, string2, ruu_32.id_throws(Short.MAX_VALUE)));
                            continue;
                        }
                        gameProfile.getProperties().put((Object)string, (Object)new Property(string, string2));
                    }
                    rRl_12 = rRl_1.id_class(ruu_32.id_case());
                    n2 = ruu_32.id_case();
                    if (!ruu_32.readBoolean()) break;
                    rgP_22 = ruu_32.id_throws();
                    break;
                }
                case UPDATE_GAME_MODE: {
                    gameProfile = new GameProfile(ruu_32.id_private(), (String)null);
                    rRl_12 = rRl_1.id_class(ruu_32.id_case());
                    break;
                }
                case UPDATE_LATENCY: {
                    gameProfile = new GameProfile(ruu_32.id_private(), (String)null);
                    n2 = ruu_32.id_case();
                    break;
                }
                case UPDATE_DISPLAY_NAME: {
                    gameProfile = new GameProfile(ruu_32.id_private(), (String)null);
                    if (!ruu_32.readBoolean()) break;
                    rgP_22 = ruu_32.id_throws();
                    break;
                }
                case REMOVE_PLAYER: {
                    gameProfile = new GameProfile(ruu_32.id_private(), (String)null);
                }
            }
            this.id_break.add(new rvo_3(this, gameProfile, n2, rRl_12, rgP_22));
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public List<rvo_3> id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_protected(this.id_break.size());
        for (rvo_3 rvo_32 : this.id_break) {
            switch (this.id_class) {
                case ADD_PLAYER: {
                    ruu_32.id_class(rvo_32.id_class().getId());
                    ruu_32.id_class(rvo_32.id_class().getName());
                    ruu_32.id_protected(rvo_32.id_class().getProperties().size());
                    for (Property property : rvo_32.id_class().getProperties().values()) {
                        ruu_32.id_class(property.getName());
                        ruu_32.id_class(property.getValue());
                        if (property.hasSignature()) {
                            ruu_32.writeBoolean(true);
                            ruu_32.id_class(property.getSignature());
                            continue;
                        }
                        ruu_32.writeBoolean(false);
                    }
                    ruu_32.id_protected(rvo_32.id_byte().id_class());
                    ruu_32.id_protected(rvo_32.id_break());
                    if (rvo_32.id_protected() == null) {
                        ruu_32.writeBoolean(false);
                        break;
                    }
                    ruu_32.writeBoolean(true);
                    ruu_32.id_class(rvo_32.id_protected());
                    break;
                }
                case UPDATE_GAME_MODE: {
                    ruu_32.id_class(rvo_32.id_class().getId());
                    ruu_32.id_protected(rvo_32.id_byte().id_class());
                    break;
                }
                case UPDATE_LATENCY: {
                    ruu_32.id_class(rvo_32.id_class().getId());
                    ruu_32.id_protected(rvo_32.id_break());
                    break;
                }
                case UPDATE_DISPLAY_NAME: {
                    ruu_32.id_class(rvo_32.id_class().getId());
                    if (rvo_32.id_protected() == null) {
                        ruu_32.writeBoolean(false);
                        break;
                    }
                    ruu_32.writeBoolean(true);
                    ruu_32.id_class(rvo_32.id_protected());
                    break;
                }
                case REMOVE_PLAYER: {
                    ruu_32.id_class(rvo_32.id_class().getId());
                }
            }
        }
    }
}

