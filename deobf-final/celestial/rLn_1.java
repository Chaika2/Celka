package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class rLn_1 {
   protected rRU class_;
   protected is_3 break_;
   protected final Int2ObjectMap<rLq_1> byte_ = new Int2ObjectOpenHashMap();
   protected int protected_;
   protected int throws_;
   protected int case_;
   protected boolean catch_;
   protected boolean private_;
   protected boolean implements_;

   public void byte_(boolean var1) {
      this.implements_ = var1;
   }

   public boolean byte_() {
      return this.catch_;
   }

   public abstract int class_(rLq_1[] var1, rLq_1 var2);

   public abstract rLp_1 class_(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10);

   public abstract rLp_1 class_(rRq_1 var1, int var2, int var3, int var4);

   public void class_(boolean var1) {
      this.catch_ = var1;
   }

   public void class_(rRU var1, is_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_.clear();
      this.protected_ = rfU_2.protected_(var2.PN() + 1.0F);
      this.throws_ = rfU_2.protected_(var2.Bm() + 1.0F);
      this.case_ = rfU_2.protected_(var2.PN() + 1.0F);
   }

   public void class_() {
      this.class_ = null;
      this.break_ = null;
   }

   protected rLq_1 class_(rfH_2 var1) {
      return this.class_(var1.b_(), var1.c_(), var1.d_());
   }

   public abstract rLv_1 class_(double var1, double var3, double var5);

   protected rLq_1 class_(int var1, int var2, int var3) {
      return (rLq_1)this.byte_.computeIfAbsent(rLq_1.break_(var1, var2, var3), var3x -> new rLq_1(var1, var2, var3));
   }

   public void break_(boolean var1) {
      this.private_ = var1;
   }

   public abstract rLq_1 break_();

   public boolean throws_() {
      return this.implements_;
   }

   public boolean protected_() {
      return this.private_;
   }
}
