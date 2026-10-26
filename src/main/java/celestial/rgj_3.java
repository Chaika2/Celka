/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.rTh_1;
import celestial.rgV_2;
import celestial.rgw_3;
import celestial.rqR_2;
import com.google.common.collect.ImmutableList;
import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class rgj_3
implements rgV_2 {
    private final GameProfile id_break;
    private final Executor id_byte;
    public final /* synthetic */ rgw_3 id_class;

    public rgj_3(rgw_3 rgw_32, GameProfile gameProfile) {
        this.id_class = rgw_32;
        this.id_break = gameProfile;
        rTh_1<Runnable> rTh_12 = rTh_1.id_class(rgw_32.id_extends, "chat stream for " + gameProfile.getName());
        this.id_byte = rTh_12::id_class;
    }

    @Override
    public CompletableFuture<Optional<String>> id_class(String string) {
        return this.id_class.id_class(this.id_break, string, this.id_class.id_finally, this.id_byte);
    }

    @Override
    public CompletableFuture<Optional<List<String>>> id_class(List<String> list2) {
        List list3 = (List)list2.stream().map(string -> this.id_class.id_class(this.id_break, (String)string, this.id_class.id_finally, this.id_byte)).collect(ImmutableList.toImmutableList());
        return ((CompletableFuture)rqR_2.id_break(list3).thenApply(list -> Optional.of((List)list.stream().map(optional -> optional.orElse("")).collect(ImmutableList.toImmutableList())))).exceptionally(throwable -> Optional.empty());
    }

    @Override
    public void id_class() {
        this.id_class.id_class(this.id_break, this.id_class.id_throws, this.id_byte);
    }

    @Override
    public void id_break() {
        this.id_class.id_class(this.id_break, this.id_class.id_case, this.id_byte);
    }
}

