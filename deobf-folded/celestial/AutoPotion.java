package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoPotion extends Module implements rrnF_2 {
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static double[] id_catch;
   public static Object[] id_break;
   public Object[] id_byte;
   private static byte[] id_private;
   private static String[] id_implements;
   private static long[] id_finally;
   private static float[] id_extends;

   public AutoPotion() {
      super(id_implements[0], id_implements[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
      this.id_return();
      rrIk_1 var5 = new rrIk_1(id_implements[2], id_throws[0]);
      this.id_byte[id_protected[1]] = var5;
      rrIk_1 var6 = new rrIk_1(id_implements[3], id_throws[1]);
      this.id_byte[1] = var6;
      rrTT var7 = new rrTT(this);
      this.id_byte[2] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.id_byte[3] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.id_byte[4] = var9;
      Setting[] var10001 = new Setting[3];
      byte var10003 = id_throws[2];
      String var10006 = id_implements[4];
      rrIk_1[] var10007 = new rrIk_1[3];
      var10007[id_throws[3]] = (rrIk_1)id_break[2];
      var10007[1] = (rrIk_1)id_break[1];
      var10007[2] = (rrIk_1)id_break[id_protected[8]];
      var10001[var10003] = new rrIc_1(var10006, var10007);
      var10001[1] = (rrIk_1)this.id_byte[id_protected[9]];
      var10001[2] = (rrIk_1)this.id_byte[1];
      this.id_class(var10001);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_finally = new long[]{150L};
   }

   @EventTarget(
      id_class = 100
   )
   public void id_class(q_1 var1) {
      this.id_return();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[11]]) {
         if (!this.id_goto()) {
            this.id_super();
            return;
         }

         HashMap var2 = new HashMap();
         rrnH_2[] var3 = rrnH_2.values();
         int var4 = var3.length;

         for (int var5 = id_throws[6]; var5 < var4; var5++) {
            rrnH_2 var6 = var3[var5];
            if (var6.id_break().get() && ((rrfw_3)this.id_byte[4]).id_class(600.0) && !this.id_break(var6)) {
               int var7 = this.id_class(var6);
               if (var7 != -1) {
                  var2.put(var7, var6);
               }
            }
         }

         boolean var9 = var2.isEmpty();
         ((rrfP_2)this.id_byte[3]).id_class(var9);
         if (var9) {
            this.id_super();
            return;
         }

         rrTg_1 var10 = () -> ((cb_3)id_import.id_class[57]).id_goto().id_case(90.0F);
         ((rrTT)this.id_byte[2]).id_class(var10, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_protected[15]]);
         if (!((cb_3)id_import.id_class[57]).z().id_break(var10.getNeedRotation(), 0.05F)) {
            return;
         }

         for (Entry var12 : var2.entrySet()) {
            int var13 = (Integer)var12.getKey();
            int var8 = this.id_break(var13);
            if (var8 != -1) {
               ((rrfw_3)this.id_byte[4]).id_class();
            }

            if (var8 > 8) {
               ((Ax_1)id_import.id_class[55]).id_class(var8);
            }
         }

         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         if (((rrIk_1)this.id_byte[1]).id_class()) {
            this.id_byte(id_throws[7]);
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_return();
      ((rrfP_2)this.id_byte[3]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2879881948232535233L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1305110724;
   }

   private int id_class(rrnH_2 var1) {
      rdn_3 var2 = ((cb_3)id_import.id_class[57]).ss();
      rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
      if (rrfH_2.id_break(var2.id_break())) {
         for (rLY var5 : rAB.id_class(var2)) {
            if (var5.id_class() == var1.id_byte()) {
               return -2;
            }
         }
      }

      if (rrfH_2.id_break(var3.id_break())) {
         for (rLY var11 : rAB.id_class(var3)) {
            if (var11.id_class() == var1.id_byte()) {
               return -3;
            }
         }
      }

      for (int var9 = id_throws[10]; var9 < 9; var9++) {
         rdn_3 var12 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var9);
         if (rrfH_2.id_break(var12.id_break())) {
            for (rLY var7 : rAB.id_class(var12)) {
               if (var7.id_class() == var1.id_byte()) {
                  return var9;
               }
            }
         }
      }

      for (int var10 = 9; var10 < 36; var10++) {
         rdn_3 var13 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var10);
         if (rrfH_2.id_break(var13.id_break())) {
            for (rLY var15 : rAB.id_class(var13)) {
               if (var15.id_class() == var1.id_byte()) {
                  return var10;
               }
            }
         }
      }

      return -1;
   }

   @Override
   public float id_break() {
      return -1.0F;
   }

   private int id_break(int var1) {
      this.id_return();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         ((rrfP_2)this.id_byte[3]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_byte[3]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else {
         return -1;
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, 13, 20, 97, 106, -59, -114, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean id_break(rrnH_2 var1) {
      rLR var2 = var1.id_byte();
      byte var3 = 10;
      return ((cb_3)id_import.id_class[57]).id_break(var2) && ((cb_3)id_import.id_class[57]).id_byte(var2).id_break() > 20 * var3 ? true : id_throws[9];
   }

   @Override
   public void id_throws(boolean var1) {
      super.id_throws(var1);
      this.id_super();
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private boolean id_goto() {
      this.id_return();
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[40]]).id_private().K().aJ_()) {
         return id_throws[11];
      } else if (((rrIk_1)this.id_byte[id_protected[41]]).id_class() && !rrfZ_2.id_byte()) {
         return id_throws[12];
      } else if ((rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[43]]
         && ((cq_3)id_import.id_class[19]).id_volatile().matches(id_implements[5])) {
         return id_throws[13];
      } else if ((!rrjc_3.id_break(0.5F) || ((cb_3)id_import.id_class[57]).BL()) && !rrjc_3.id_class(2.0F)) {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[46]]).id_private().E().id_long().id_break() < 150L ? id_throws[15] : true;
      } else {
         return id_throws[14];
      }
   }

   private static void id_continue() {
      Object[] var0 = new Object[]{new rrIk_1(id_implements[6], true), new rrIk_1(id_implements[7], true), new rrIk_1(id_implements[8], true)};
      id_break = var0;
   }

   private static void id_else() {
      id_extends = new float[]{0.05F, 0.5F, 2.0F, -1.0F, -1.0F, 90.0F};
   }

   private static void id_instanceof() {
      id_throws = new boolean[]{
         false, false, false, false, true, true, false, false, true, false, false, false, false, false, false, false, true, true, false, true, true, true
      };
   }

   private static void id_new() {
      id_protected = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         2,
         1,
         0,
         0,
         1,
         0,
         4,
         3,
         2,
         0,
         57,
         4,
         55,
         57,
         1,
         1,
         3,
         57,
         57,
         3,
         57,
         1,
         57,
         1,
         3,
         57,
         1,
         55,
         57,
         57,
         57,
         1,
         57,
         1,
         0,
         0,
         1,
         0,
         19,
         57,
         0,
         2,
         3,
         57,
         57
      };
   }

   private void id_return() {
      if (this.id_byte == null) {
         this.id_byte = new Object[5];
      }
   }

   private void id_super() {
      this.id_return();
      ((rrTT)this.id_byte[2]).id_final();
   }

   private static void id_try() {
      id_catch = new double[]{600.0};
   }

   private static void id_while() {
      id_private = new byte[]{3, 3, 2, 2, -1, -1, 8, 10, 20, -2, -3, 9, 9, 36, -1, -2, -3, 9, 9, 36, -1, 2, 5, 3};
   }

   private static void id_public() {
      id_implements = new String[]{
         new String("Auto Pot"),
         new String("Автоматически кидает зелья"),
         new String("Только в ПВП"),
         new String("Авто. выключение"),
         new String("Кидать"),
         new String("\\d+"),
         new String("Силу"),
         new String("Скорость"),
         new String("Защиту от огня")
      };
   }

   @Override
   public float id_private() {
      return -1.0F;
   }

   @Override
   public rrTq_1 aB_() {
      return new rrTq_1(rjG_2.id_catch(), ((cb_3)id_import.id_class[57]).id_goto());
   }
}
