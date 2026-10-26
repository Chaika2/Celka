package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TriggerBot extends Module implements rrnL_2 {
   private static float[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_catch;
   public static Object[] id_break;
   private static short[] id_private;
   private static long[] id_implements;
   public Object[] id_byte;
   private static String[] id_finally;
   private static double[] id_extends;

   private void id_char() {
      if (this.id_byte == null) {
         this.id_byte = new Object[18];
         this.id_byte[9] = 0L;
         this.id_byte[10] = false;
         this.id_byte[11] = 0L;
         this.id_byte[12] = 0;
         this.id_byte[13] = 0;
         this.id_byte[14] = 0;
         this.id_byte[15] = 0;
         this.id_byte[16] = false;
         this.id_byte[17] = 0.0F;
      }
   }

   private void id_byte(iB_2 var1) {
      this.id_char();
      if (var1 != null) {
         this.id_byte[8] = var1;
         Long var7 = System.currentTimeMillis();
         this.id_byte[9] = var7;
      }

      this.id_byte[7] = var1;
   }

   private static void id_long() {
      id_implements = new long[]{1000L, 0L, 0L};
   }

   private static void id_float() {
      id_catch = new boolean[]{
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   public TriggerBot() {
      super(id_finally[0], id_finally[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_private[0]]);
      this.id_char();
      CheckGroup var5 = new CheckGroup()
         .id_catch(true)
         .id_case(true)
         .id_throws(id_catch[2])
         .id_implements(id_catch[3])
         .id_byte(id_catch[4])
         .id_protected(id_catch[5])
         .id_class(true);
      this.id_byte[id_private[1]] = var5;
      String var10003 = id_finally[2];
      String var10004 = id_finally[3];
      String[] var10005 = new String[2];
      var10005[id_catch[7]] = id_finally[4];
      var10005[1] = id_finally[5];
      rrIQ var6 = new rrIQ(var10003, var10004, var10005).id_class(id_finally[6], (var1, var2) -> {
         this.id_char();
         Integer var7x = Integer.valueOf(id_catch[93]);
         this.id_byte[12] = var7x;
         Integer var8x = Integer.valueOf(id_catch[94]);
         this.id_byte[14] = var8x;
         Integer var9x = Integer.valueOf(id_catch[95]);
         this.id_byte[15] = var9x;
         Boolean var10x = id_catch[96];
         this.id_byte[16] = var10x;
         Float var11x = -1.0F;
         this.id_byte[17] = var11x;
      });
      this.id_byte[1] = var6;
      rrIk_1 var7 = new rrIk_1(id_finally[7], true);
      this.id_byte[2] = var7;
      rrIk_1 var8 = new rrIk_1(id_finally[8], id_catch[10]);
      this.id_byte[3] = var8;
      rrIk_1 var9 = new rrIk_1(id_finally[9], id_catch[11]);
      this.id_byte[4] = var9;
      rrIk_1 var10 = new rrIk_1(id_finally[10], id_catch[12]).id_class(() -> {
         this.id_char();
         return ((rrIk_1)this.id_byte[2]).id_class();
      });
      this.id_byte[5] = var10;
      rrIk_1 var11 = new rrIk_1(id_finally[11], true);
      this.id_byte[6] = var11;
      Float var12 = -1.0F;
      this.id_byte[17] = var12;
      Setting[] var10001 = new Setting[5];
      byte var13 = id_catch[14];
      String var10006 = id_finally[12];
      Setting[] var10007 = new Setting[1];
      var10007[id_catch[16]] = new rrIc_1(id_finally[13], ((CheckGroup)this.id_byte[id_private[9]]).id_byte());
      var10001[var13] = new GroupSetting(var10006, var10007);
      var10006 = id_finally[14];
      var10007 = new Setting[1];
      var10007[id_catch[19]] = (rrIQ)this.id_byte[1];
      var10001[1] = new GroupSetting(var10006, var10007);
      var10006 = id_finally[15];
      var10007 = new Setting[1];
      byte var10009 = id_catch[21];
      String var10012 = id_finally[16];
      rrIk_1[] var10013 = new rrIk_1[1];
      var10013[id_catch[23]] = (rrIk_1)this.id_byte[6];
      var10007[var10009] = new rrIc_1(var10012, var10013);
      var10001[2] = new GroupSetting(var10006, var10007);
      var10006 = id_finally[17];
      var10007 = new Setting[3];
      var10007[id_catch[24]] = (rrIk_1)this.id_byte[2];
      var10007[1] = (rrIk_1)this.id_byte[3];
      var10007[2] = (rrIk_1)this.id_byte[4];
      var10001[3] = new GroupSetting(var10006, var10007);
      var10006 = id_finally[18];
      var10007 = new Setting[1];
      var10007[id_catch[27]] = (rrIk_1)this.id_byte[5];
      var10001[4] = new GroupSetting(var10006, var10007);
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   public Y id_this() {
      return (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[124]];
   }

   private static void id_interface() {
      id_finally = new String[]{
         new String("Trigger Bot"),
         new String("Автоматически бьет существо\nесли оно на прицеле"),
         new String("Обход спринта"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Legit"),
         new String("change_mode"),
         new String("Только криты"),
         new String("Останавливать при\nиспользовании предмета"),
         new String("Останавливать при\nоткрытом контейнере"),
         new String("Только с пробелом"),
         new String("Таргет-HUD"),
         new String("Цели"),
         new String("Выбор"),
         new String("Обходы"),
         new String("Визуалы"),
         new String("Отображать"),
         new String("Удары"),
         new String("Криты"),
         new String("Legit"),
         new String("Legit"),
         new String("Legit")
      };
   }

   public boolean id_class(an_3 var1) {
      this.id_char();
      if (var1 == ((cb_3)id_import.id_class[57]).ra()) {
         return id_catch[89];
      } else if (var1 == (cb_3)id_import.id_class[57]) {
         return id_catch[90];
      } else if (var1 instanceof rSY) {
         return id_catch[91];
      } else {
         return !var1.Pu() ? id_catch[92] : rrff_3.id_class(var1, (CheckGroup)this.id_byte[id_private[115]]);
      }
   }

   public boolean id_class(float var1, int var2, boolean var3, boolean var4, int var5) {
      this.id_char();
      if (this.id_new() == null) {
         return id_catch[52];
      } else if (((rrIk_1)this.id_byte[3]).id_class() && ((cb_3)id_import.id_class[57]).sL()) {
         return id_catch[53];
      } else if (!((rrIk_1)this.id_byte[4]).id_class() || (vm_3)id_import.id_class[73] == null && !C_throws.id_byte().id_return().id_class()) {
         if (!this.id_class(var1, var2)) {
            return id_catch[55];
         } else {
            return ((rrIk_1)this.id_byte[2]).id_class() ? this.id_class(var3, var4, var5) : true;
         }
      } else {
         return id_catch[54];
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_char();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_private[16]]) {
         if ((Integer)this.id_byte[13] > 0 && ((cb_3)id_import.id_class[57]).BL()) {
            Integer var9 = (Integer)this.id_byte[13] - 1;
            this.id_byte[13] = var9;
         }

         if ((Integer)this.id_byte[12] > 0) {
            Integer var10 = (Integer)this.id_byte[12] - 1;
            this.id_byte[12] = var10;
         }

         this.id_byte(null);
         if (((Ax_1)id_import.id_class[55]).id_finally()) {
            return;
         }

         rjG_2 var3 = (rjG_2)id_import.id_class[64];
         if (var3 instanceof rfo_3 var2) {
            an_3 var11 = var2.id_class();
            if (var11 instanceof iB_2 var4 && this.id_class(var11)) {
               this.id_byte(var4);
               this.id_class((iB_2)this.id_byte[7]);
               if (this.id_goto()) {
                  this.id_break(var4);
               }
            }
         }
      }

      this.id_break(var1);
   }

   public void id_class(iB_2 var1) {
      this.id_char();
      if (var1 != null && rmD_2.id_break && ((rrIQ)this.id_byte[1]).id_byte().equals(id_finally[21])) {
         if (this.id_throw() && this.id_class(2.0F, 50, id_catch[82], id_catch[83], 1)) {
            ((cb_3)id_import.id_class[57]).c_(id_catch[85]);
            Integer var6 = 1;
            this.id_byte[12] = var6;
         }
      }
   }

   @EventTarget
   public void id_class(rrAS var1) {
      this.id_char();
      if ((Integer)this.id_byte[13] > 0) {
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1807743029;
   }

   @EventTarget
   public void id_class(rrAF var1) {
      this.id_char();
      if ((Integer)this.id_byte[12] > 0) {
         var1.id_class(id_catch[31]);
      }
   }

   public boolean id_class(boolean var1, boolean var2, int var3) {
      this.id_char();
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_private[64]]).id_private().t().id_new()) {
         return true;
      } else if (var1 && !this.id_throw()) {
         return true;
      } else {
         if (var2) {
            double var4 = Math.abs((double)((int)((cb_3)id_import.id_class[57]).re()) - ((cb_3)id_import.id_class[57]).re());
            if (var4 == 0.43152384527073195) {
               Integer var12 = 2;
               this.id_byte[13] = var12;
            } else if (var4 == 0.0548933470320776) {
               Integer var13 = 3;
               this.id_byte[13] = var13;
            }
         }

         float var5;
         boolean var14;
         if (var3 > 0) {
            rrvy_1 var6 = new rrvy_1((cb_3)id_import.id_class[57]);
            var6.id_class(var3);
            var14 = !var6.BL() && var6.id_throws[31] > id_protected[5] ? true : id_catch[63];
            var5 = (Float)var6.id_throws[31];
         } else {
            var14 = !((cb_3)id_import.id_class[57]).BL() && ((cb_3)id_import.id_class[57]).id_throws[31] > id_protected[6] ? true : id_catch[65];
            var5 = (Float)((cb_3)id_import.id_class[57]).id_throws[31];
         }

         if (((rrIQ)this.id_byte[1]).id_byte().equals(id_finally[20]) && (Boolean)this.id_byte[16] && (Float)this.id_byte[17] == var5) {
            rrvy_1 var15 = new rrvy_1((cb_3)id_import.id_class[57]);
            List var7 = var15.id_else();
            if (var7.size() > 1) {
               return id_catch[67];
            }
         }

         return var14;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2028490841078140124L;
   }

   public boolean id_class(float var1, int var2) {
      this.id_char();
      if (!rrfo_3.id_class(var1)) {
         return id_catch[57];
      } else {
         return (float)(System.currentTimeMillis() - this.id_byte[11]) >= 500.0F - (float)var2 ? true : id_catch[59];
      }
   }

   private static void id_void() {
      id_extends = new double[]{0.43152384527073195, 0.0548933470320776, 0.0, 0.1, 0.0, 0.125, 0.1875};
   }

   public boolean id_break(iB_2 var1) {
      this.id_char();
      boolean var2 = ((rrIQ)this.id_byte[1]).id_byte().equals(id_finally[19]);
      if (this.id_throw() && rmD_2.id_break) {
         if (var2) {
            ((cb_3)id_import.id_class[57]).c_(id_catch[34]);
            if ((Integer)this.id_byte[12] == 0) {
               Integer var7 = 1;
               this.id_byte[12] = var7;
            }

            return id_catch[36];
         }

         ((cb_3)id_import.id_class[57]).c_(id_catch[37]);
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_private[38]]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.STOP_SPRINTING));
         Boolean var8 = true;
         this.id_byte[10] = var8;
      }

      ((Ax_1)id_import.id_class[55]).id_class((cb_3)id_import.id_class[57], var1, true);
      if (var2) {
         int var10002 = (Integer)this.id_byte[14] + 1;
         Integer var9 = var10002;
         this.id_byte[14] = var9;
         if (var10002 >= 2) {
            Integer var10 = Integer.valueOf(id_catch[41]);
            this.id_byte[14] = var10;
            Integer var11 = 1;
            this.id_byte[12] = var11;
         }

         var10002 = (Integer)this.id_byte[15] + 1;
         Integer var12 = var10002;
         this.id_byte[15] = var12;
         if (var10002 >= 14) {
            Boolean var13 = true;
            this.id_byte[16] = var13;
            Float var14 = (Float)((cb_3)id_import.id_class[57]).id_throws[31];
            this.id_byte[17] = var14;
         }

         if ((Integer)this.id_byte[15] >= 15) {
            Integer var15 = Integer.valueOf(id_catch[45]);
            this.id_byte[15] = var15;
            Boolean var16 = id_catch[46];
            this.id_byte[16] = var16;
            Float var17 = -1.0F;
            this.id_byte[17] = var17;
         }
      }

      Long var18 = System.currentTimeMillis();
      this.id_byte[11] = var18;
      return true;
   }

   public void id_break(q_1 var1) {
      this.id_char();
      if (var1.id_class() == this.id_this() && (Boolean)this.id_byte[10]) {
         ((Aq_1)((cb_3)id_import.id_class[57]).id_break[id_private[109]]).id_class(new rmD_2((cb_3)id_import.id_class[57], rmU_2.START_SPRINTING));
         ((cb_3)id_import.id_class[57]).c_(true);
         Boolean var6 = id_catch[88];
         this.id_byte[10] = var6;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 36, 86, -123, -26, 83, -110, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_throws(boolean var1) {
      this.id_char();
      super.id_throws(var1);
      this.id_byte(null);
      Integer var6 = Integer.valueOf(id_catch[32]);
      this.id_byte[13] = var6;
      Integer var7 = Integer.valueOf(id_catch[33]);
      this.id_byte[12] = var7;
      Float var8 = -1.0F;
      this.id_byte[17] = var8;
   }

   public boolean id_goto() {
      return this.id_class(0.5F, id_catch[48], true, true, id_catch[51]);
   }

   public rrIk_1 id_continue() {
      this.id_char();
      return (rrIk_1)this.id_byte[4];
   }

   public boolean id_else() {
      if (this.id_while().id_class()) {
         return true;
      } else {
         return ((cb_3)id_import.id_class[57]).id_break(rLD.id_private) ? true : id_catch[81];
      }
   }

   private static void id_import() {
      id_private = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         17,
         0,
         1,
         6,
         2,
         3,
         4,
         5,
         0,
         13,
         57,
         13,
         13,
         12,
         12,
         12,
         55,
         64,
         7,
         13,
         12,
         13,
         12,
         17,
         1,
         57,
         12,
         12,
         57,
         57,
         0,
         57,
         10,
         55,
         57,
         14,
         14,
         14,
         12,
         15,
         15,
         16,
         57,
         31,
         17,
         15,
         15,
         16,
         17,
         11,
         3,
         57,
         4,
         73,
         2,
         11,
         0,
         57,
         57,
         13,
         13,
         57,
         31,
         31,
         57,
         57,
         31,
         57,
         31,
         1,
         16,
         17,
         57,
         57,
         57,
         17,
         57,
         57,
         56,
         57,
         57,
         57,
         57,
         57,
         57,
         18,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         1,
         57,
         12,
         10,
         57,
         0,
         57,
         57,
         10,
         57,
         57,
         0,
         7,
         6,
         8,
         9,
         8,
         8,
         9,
         7,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         2,
         12,
         14,
         15,
         16,
         17
      };
   }

   private static void id_instanceof() {
      id_protected = new float[]{-1.0F, -1.0F, -1.0F, 0.5F, 500.0F, 0.0F, 0.0F, 0.8F, 2.0F, -1.0F, 0.0F};
   }

   public iB_2 id_new() {
      this.id_char();
      return (iB_2)this.id_byte[7];
   }

   public rrIk_1 id_return() {
      this.id_char();
      return (rrIk_1)this.id_byte[3];
   }

   public rrIk_1 id_super() {
      this.id_char();
      return (rrIk_1)this.id_byte[2];
   }

   private boolean id_throw() {
      boolean var1 = ((cb_3)id_import.id_class[57]).BL();
      if (this.id_else() && !((rqr_3)((cb_3)id_import.id_class[57]).id_break[17]).id_private && var1) {
         return id_catch[68];
      } else {
         float var2 = 0.8F;
         boolean var3 = ((cb_3)id_import.id_class[57]).PZ() && !((cb_3)id_import.id_class[57]).id_catch(var2) ? true : id_catch[70];
         boolean var4 = ((gm_3)id_import.id_class[56]).id_break(((cb_3)id_import.id_class[57]).rN().id_protected(id_extends[2], 0.1, id_extends[4]));
         double var5 = Math.abs((double)((int)((cb_3)id_import.id_class[57]).re()) - ((cb_3)id_import.id_class[57]).re());
         boolean var7 = (var5 == 0.125 || var5 == 0.1875) && !var4 ? true : id_catch[72];
         boolean var8 = ((cb_3)id_import.id_class[57]).id_throws(iM_2.STANDING) && var1 ? true : id_catch[74];
         boolean var9 = !var4 && var1 ? true : id_catch[76];
         return !((cb_3)id_import.id_class[57]).Sy()
               && !((rhx_3)((cb_3)id_import.id_class[57]).id_implements[18]).id_break
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_goto)
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_package)
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_instanceof)
               && !((cb_3)id_import.id_class[57]).id_break(rLD.id_protected)
               && !((cb_3)id_import.id_class[57]).Pm()
               && !((cb_3)id_import.id_class[57]).o_()
               && !((cb_3)id_import.id_class[57]).Y()
               && !((cb_3)id_import.id_class[57]).Pe()
               && !((cb_3)id_import.id_class[57]).Py()
               && !var3
               && !var7
               && !var8
               && !var9
            ? true
            : id_catch[78];
      }
   }

   public rrIQ id_try() {
      this.id_char();
      return (rrIQ)this.id_byte[1];
   }

   public rrIk_1 id_while() {
      this.id_char();
      return (rrIk_1)this.id_byte[5];
   }

   private static void id_static() {
      id_throws = new byte[]{2, 5, 2, 3, 3, 2, 4, 2, 14, 15, 2, 3, 50, 18, 9, 10, 11, 12, 13, 14, 15, 16, 17, 3, 2, 14, 2, 15};
   }

   public rrIk_1 id_public() {
      this.id_char();
      return (rrIk_1)this.id_byte[6];
   }

   private static void id_abstract() {
      Object[] var0 = new Object[]{2, 14, 15};
      id_break = var0;
   }

   @Override
   public iB_2 id_native() {
      this.id_char();
      if (!((rrIk_1)this.id_byte[6]).id_class()) {
         return null;
      } else {
         iB_2 var1 = this.id_new();
         return var1 == null && (iB_2)this.id_byte[8] != null && System.currentTimeMillis() - this.id_byte[9] < 1000L ? (iB_2)this.id_byte[8] : var1;
      }
   }
}
