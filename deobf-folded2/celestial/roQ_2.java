package celestial;

import java.util.function.Predicate;

public class roQ_2 {
   private static final rVE<xc_3> id_break = new rVb_1<>(xd_3.id_char, xu_3.id_class.id_continue());
   private final int id_byte;
   private short id_protected;
   private short id_throws;
   private short id_case;
   private final rVM<xc_3> id_catch;
   public static final ThreadLocal<rrbB_2> id_class = new ThreadLocal<>();

   public boolean id_byte() {
      return this.id_protected == 0;
   }

   public roQ_2(int var1) {
      this(var1, (short)0, (short)0, (short)0);
   }

   public roQ_2(int var1, short var2, short var3, short var4) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = new rVM<>(id_break, xd_3.id_char, rco_3::id_byte, rco_3::id_class, xu_3.id_class.id_continue());
   }

   public static boolean id_class(roQ_2 var0) {
      return var0 == roJ_2.id_class || var0.id_byte();
   }

   public xc_3 id_class(int var1, int var2, int var3) {
      return this.id_catch.id_class(var1, var2, var3);
   }

   public void id_class(ruu_3 var1) {
      this.id_protected = var1.readShort();
      this.id_catch.id_class(var1);
   }

   public boolean id_class(Predicate<xc_3> var1) {
      return this.id_catch.id_class(var1);
   }

   public void id_class() {
      this.id_catch.id_class();
   }

   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, boolean var5) {
      xc_3 var6;
      if (var5) {
         var6 = this.id_catch.id_class(var1, var2, var3, var4);
      } else {
         var6 = this.id_catch.id_break(var1, var2, var3, var4);
      }

      rXE var7 = var6.id_volatile();
      rXE var8 = var4.id_volatile();
      if (!var6.id_catch()) {
         this.id_protected--;
         if (var6.id_final()) {
            this.id_throws--;
         }
      }

      if (!var7.id_byte()) {
         this.id_case--;
      }

      if (!var4.id_catch()) {
         this.id_protected++;
         if (var4.id_final()) {
            this.id_throws++;
         }
      }

      if (!var8.id_byte()) {
         this.id_case++;
      }

      return var6;
   }

   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4) {
      return this.id_class(var1, var2, var3, var4, true);
   }

   public rXE id_break(int var1, int var2, int var3) {
      return this.id_catch.id_class(var1, var2, var3).id_volatile();
   }

   public void id_break() {
      this.id_catch.id_break();
   }

   public void id_break(ruu_3 var1) {
      var1.writeShort(this.id_protected);
      this.id_catch.id_break(var1);
   }

   public boolean id_throws() {
      return this.id_throws > 0;
   }

   public int id_finally() {
      return 2 + this.id_catch.id_byte();
   }

   public int id_catch() {
      return this.id_byte;
   }

   public short id_extends() {
      return this.id_protected;
   }

   public boolean id_case() {
      return this.id_case > 0;
   }

   public rVM<xc_3> id_implements() {
      return this.id_catch;
   }

   public boolean id_protected() {
      return this.id_throws() || this.id_case();
   }

   public void id_private() {
      rrbB_2 var1 = id_class.get();
      if (var1 != null) {
         rrbE_2[] var2 = var1.id_class();
         if (var2 != null) {
            int var3 = this.id_byte >> 4;
            if (var3 >= 0 && var3 < var2.length) {
               rrbE_2 var4 = var2[var3];
               if (var4 != null) {
                  this.id_protected = var4.id_class();
                  this.id_throws = var4.id_break();
                  this.id_case = var4.id_byte();
                  var2[var3] = null;
                  return;
               }
            }
         }
      }

      this.id_protected = 0;
      this.id_throws = 0;
      this.id_case = 0;
      this.id_catch.id_class((var1x, var2x) -> {
         rXE var3x = var1x.id_volatile();
         if (!var1x.id_catch()) {
            this.id_protected = (short)(this.id_protected + var2x);
            if (var1x.id_final()) {
               this.id_throws = (short)(this.id_throws + var2x);
            }
         }

         if (!var3x.id_byte()) {
            this.id_protected = (short)(this.id_protected + var2x);
            if (var3x.id_case()) {
               this.id_case = (short)(this.id_case + var2x);
            }
         }
      });
   }

   public short id_volatile() {
      return this.id_case;
   }

   public short id_native() {
      return this.id_throws;
   }
}
