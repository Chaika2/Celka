package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlf_3 extends rrlg_3 {
   private static short[] id_protected;
   public Object[] id_class;
   private static String[] id_case;
   private static byte[] id_catch;
   private static boolean[] id_private;
   public static Object[] id_break;

   private static void id_byte() {
      id_case = new String[]{
         new String("Включено"), new String("enabled"), new String("Еда"), new String("display"), new String("RepairCost"), new String("Enchantments")
      };
   }

   private Pair<rdn_3, Integer> id_int() {
      ArrayList var1 = new ArrayList();

      for (int var2 = id_private[15]; var2 < id_catch[2]; var2++) {
         rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_protected[37]]).id_implements[id_protected[38]]).id_extends(var2);
         if (!var3.id_class() && var3.id_long() && !this.id_break(var3)) {
            var1.add(Pair.of(var3, rrfY_2.id_break(var2)));
         }
      }

      return var1.isEmpty() ? null : (Pair)var1.stream().max((rrlj_3)id_break[id_protected[39]]).orElse(null);
   }

   public rrlf_3(AutoUse var1) {
      super(var1);
      this.id_final();
      rrIk_1 var6 = new rrIk_1(id_case[0], id_private[0]).id_class(id_case[1], (var1x, var2) -> {
         if (!var1x.id_byte()) {
            this.id_extends();
         }
      });
      this.id_class[id_protected[0]] = var6;
      String var10003 = id_case[2];
      Setting[] var10004 = new Setting[id_private[1]];
      var10004[id_private[2]] = (rrIk_1)this.id_class[id_protected[1]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1358611595;
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(rrLH var1) {
      this.id_final();
      if (var1.id_protected() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_protected[27]] && (Boolean)this.id_class[id_protected[28]]) {
         var1.id_class(id_private[8]);
      }
   }

   @Override
   public boolean id_class() {
      this.id_final();
      return (Boolean)this.id_class[id_protected[34]];
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(rrLp_1 var1) {
      this.id_final();
      rrLq_1 var2 = var1.id_case();
      if ((
            var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_protected[29]]
               || var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_protected[30]]
         )
         && (Boolean)this.id_class[id_protected[31]]) {
         var1.id_class(id_private[9]);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6973746864388905614L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, -47, -126, 77, 38, 43, 47, -96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(rrAC var1) {
      this.id_final();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[32]] && (Boolean)this.id_class[id_protected[33]]) {
         var1.id_class(id_private[10]);
      }
   }

   public boolean id_class(rdn_3 var1) {
      this.id_final();
      if (!this.id_case()) {
         return id_private[11];
      } else if ((Boolean)this.id_class[id_protected[35]]) {
         return id_private[12];
      } else {
         rpQ_2 var2 = ((cb_3)id_import.id_class[id_protected[36]]).sk();
         return var2.id_class() <= var2.id_protected() - var1.id_break().id_this().id_class() ? id_private[13] : id_private[14];
      }
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(q_1 var1) {
      this.id_final();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[2]]) {
         AutoUse var2 = this.id_continue();
         if (!((rrIk_1)this.id_class[id_protected[3]]).id_class() || !var2.id_class(this)) {
            this.id_package();
            return;
         }

         Pair var3 = this.id_int();
         if (var3 == null) {
            this.id_package();
            return;
         }

         rdn_3 var4 = (rdn_3)var3.getLeft();
         int var5 = (Integer)var3.getRight();
         if (!this.id_class(var4)) {
            this.id_package();
            return;
         }

         this.id_private();
         rdn_3 var6 = ((cb_3)id_import.id_class[id_protected[4]]).Sn();
         int var7 = ((rJr_1)((cb_3)id_import.id_class[id_protected[5]]).id_implements[id_protected[6]]).id_case;
         if (var7 == 0 && !rdn_3.id_byte(var6, var4)) {
            ((Ax_1)id_import.id_class[id_protected[7]]).id_class(var7, var5, id_catch[0], rXa_1.SWAP, id_private[3]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_finally().id_class(rrLY.id_class());
            Boolean var13 = id_private[4];
            this.id_class[id_protected[9]] = var13;
            return;
         }

         if (!(Boolean)this.id_class[id_protected[10]] && !((cb_3)id_import.id_class[id_protected[11]]).id_return() && var6.id_break().id_super()) {
            ryZ_2 var8 = ((Ax_1)id_import.id_class[id_protected[12]]).id_class(rpm_3.OFF_HAND);
            if (var8.id_class()) {
               ((cb_3)id_import.id_class[id_protected[13]]).id_break(rpm_3.OFF_HAND);
               ((Hh_1)id_import.id_class[id_protected[14]]).id_class.id_class(rpm_3.OFF_HAND);
               Boolean var14 = id_private[5];
               this.id_class[id_protected[15]] = var14;
            }
         }

         if ((Boolean)this.id_class[id_protected[16]]) {
            rpQ_2 var19 = ((cb_3)id_import.id_class[id_protected[17]]).sk();
            if (var19.id_class() != (Integer)this.id_class[id_protected[18]]) {
               Integer var15 = var19.id_class();
               this.id_class[id_protected[19]] = var15;
               Boolean var16 = var19.id_break();
               this.id_class[id_protected[20]] = var16;
            }

            if (!((cb_3)id_import.id_class[id_protected[21]]).id_return()) {
               Boolean var17 = id_private[6];
               this.id_class[id_protected[22]] = var17;
            } else if (((cb_3)id_import.id_class[id_protected[23]]).Sw() > var6.id_extends() * id_catch[1]) {
               ((Ax_1)id_import.id_class[id_protected[24]]).id_byte((cb_3)id_import.id_class[id_protected[25]]);
               Boolean var18 = id_private[7];
               this.id_class[id_protected[26]] = var18;
            }
         }
      }
   }

   private boolean id_break(rdn_3 var1) {
      rcd_3 var2 = var1.id_package();
      if (var2 == null) {
         return id_private[16];
      } else {
         rcd_3 var3 = var2.id_catch();
         var3.id_continue(id_case[3]);
         var3.id_continue(id_case[4]);
         var3.id_continue(id_case[5]);
         return !var3.id_protected().isEmpty() ? id_private[17] : id_private[18];
      }
   }

   private static void id_break() {
      id_protected = new short[]{
         0,
         0,
         0,
         0,
         57,
         57,
         4,
         55,
         0,
         1,
         1,
         57,
         55,
         57,
         16,
         1,
         1,
         57,
         3,
         3,
         2,
         57,
         1,
         57,
         55,
         57,
         1,
         0,
         1,
         1,
         0,
         1,
         0,
         1,
         1,
         2,
         57,
         57,
         1,
         0,
         1,
         57,
         55,
         57,
         1,
         2
      };
   }

   private static void id_finally() {
      id_private = new boolean[]{
         true,
         true,
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
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private void id_extends() {
      this.id_final();
      if ((Boolean)this.id_class[id_protected[40]] && ((cb_3)id_import.id_class[id_protected[41]]).id_return()) {
         ((Ax_1)id_import.id_class[id_protected[42]]).id_byte((cb_3)id_import.id_class[id_protected[43]]);
      }

      this.id_package();
   }

   private static void id_implements() {
      id_catch = new byte[]{40, 2, 45, 4, 2, 3};
   }

   private void id_package() {
      this.id_final();
      Boolean var5 = id_private[19];
      this.id_class[id_protected[44]] = var5;
      Boolean var6 = id_private[20];
      this.id_class[id_protected[45]] = var6;
   }

   private void id_final() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[1] = false;
         this.id_class[2] = false;
         this.id_class[3] = 0;
      }
   }

   private static void id_native() {
      Object[] var0 = new Object[]{new rrlj_3()};
      id_break = var0;
   }

   @Override
   public boolean aK_() {
      this.id_extends();
      return super.aK_();
   }
}
