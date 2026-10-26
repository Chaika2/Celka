package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class rLn_1 {
   protected rRU id_class;
   protected is_3 id_break;
   protected final Int2ObjectMap<rLq_1> id_byte = new Int2ObjectOpenHashMap();
   protected int id_protected;
   protected int id_throws;
   protected int id_case;
   protected boolean id_catch;
   protected boolean id_private;
   protected boolean id_implements;

   public void id_byte(boolean var1) {
      this.id_implements = var1;
   }

   public boolean id_byte() {
      return this.id_catch;
   }

   public abstract int id_class(rLq_1[] var1, rLq_1 var2);

   public abstract rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10);

   public abstract rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4);

   public void id_class(boolean var1) {
      this.id_catch = var1;
   }

   public void id_class(rRU var1, is_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte.clear();
      this.id_protected = rfU_2.id_protected(var2.PN() + 1.0F);
      this.id_throws = rfU_2.id_protected(var2.Bm() + 1.0F);
      this.id_case = rfU_2.id_protected(var2.PN() + 1.0F);
   }

   public void id_class() {
      this.id_class = null;
      this.id_break = null;
   }

   protected rLq_1 id_class(rfH_2 var1) {
      return this.id_class(var1.b_(), var1.c_(), var1.d_());
   }

   public abstract rLv_1 id_class(double var1, double var3, double var5);

   protected rLq_1 id_class(int var1, int var2, int var3) {
      return (rLq_1)this.id_byte.computeIfAbsent(rLq_1.id_break(var1, var2, var3), var3x -> new rLq_1(var1, var2, var3));
   }

   public void id_break(boolean var1) {
      this.id_private = var1;
   }

   public abstract rLq_1 id_break();

   public boolean id_throws() {
      return this.id_implements;
   }

   public boolean id_protected() {
      return this.id_private;
   }
}
