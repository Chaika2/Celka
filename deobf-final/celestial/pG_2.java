package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class pG_2 {
   public final UUID class_;
   public final int break_;
   public final String byte_;
   public final String protected_;
   public final int throws_;
   public final float case_;
   public final float catch_;
   public final eX_2 private_;
   public final String implements_;
   public final rLC finally_;
   public final boolean extends_;
   public final List<String> native_ = Lists.newArrayList();
   public final List<String> volatile_ = Lists.newArrayList();
   public final List<String> final_ = Lists.newArrayList();
   public final List<String> package_ = Lists.newArrayList();
   public final Set<rfH_2> int_ = Sets.newHashSet();
   public final Set<rfH_2> new_ = Sets.newHashSet();

   public pG_2(UUID var1, int var2, String var3, String var4, int var5, float var6, float var7, eX_2 var8, String var9, rLC var10, boolean var11) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var10;
      this.extends_ = var11;
   }

   public UUID class_() {
      return this.class_;
   }

   boolean class_(rfH_2 var1) {
      return this.int_.stream().anyMatch(var1::equals);
   }

   boolean break_(rfH_2 var1) {
      return this.new_.contains(var1);
   }
}
