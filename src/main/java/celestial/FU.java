/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.UserApiService
 */
package celestial;

import celestial.Aw_1;
import celestial.Fe_1;
import celestial.QY;
import celestial.rqR_2;
import celestial.vm_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.UserApiService;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class FU {
    private final QY id_class;
    private final Set<UUID> id_break = Sets.newHashSet();
    private final UserApiService id_byte;
    private final Map<String, UUID> id_protected = Maps.newHashMap();

    public boolean id_byte(UUID uUID) {
        return this.id_protected(uUID) || this.id_throws(uUID);
    }

    public FU(QY qY, UserApiService userApiService) {
        this.id_class = qY;
        this.id_byte = userApiService;
    }

    public UUID id_class(String string) {
        return this.id_protected.getOrDefault(string, rqR_2.id_break);
    }

    public Set<UUID> id_class() {
        return this.id_break;
    }

    public void id_class(UUID uUID) {
        this.id_break.add(uUID);
    }

    public void id_class(Aw_1 aw_1) {
        vm_3 vm_32;
        GameProfile gameProfile = aw_1.id_class();
        if (gameProfile.isComplete()) {
            this.id_protected.put(gameProfile.getName(), gameProfile.getId());
        }
        if ((vm_32 = (vm_3)this.id_class.id_class[73]) instanceof Fe_1) {
            Fe_1 fe_1 = (Fe_1)vm_32;
            fe_1.id_class(aw_1);
        }
    }

    public void id_break(UUID uUID) {
        this.id_break.remove(uUID);
    }

    public boolean id_throws(UUID uUID) {
        return this.id_byte.isBlockedPlayer(uUID);
    }

    public void id_case(UUID uUID) {
        vm_3 vm_32 = (vm_3)this.id_class.id_class[73];
        if (vm_32 instanceof Fe_1) {
            Fe_1 fe_1 = (Fe_1)vm_32;
            fe_1.id_class(uUID);
        }
    }

    public boolean id_protected(UUID uUID) {
        return this.id_break.contains(uUID);
    }
}

