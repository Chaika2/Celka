package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlV_2 extends rrlg_3 {
   private static byte[] id_break;
   private static String[] id_protected;
   private static short[] id_case;
   public Object[] id_class;
   private static boolean[] id_catch;

   public boolean id_byte() {
      if (!this.id_case()) {
         return id_catch[11];
      } else {
         return !((cb_3)id_import.id_class[57]).id_break(rLD.id_final) ? true : id_catch[13];
      }
   }

   public rrlV_2(AutoUse var1) {
      super(var1);
      this.id_extends();
      rrIk_1 var6 = new rrIk_1(id_protected[0], id_catch[0]).id_class(id_protected[1], (var1x, var2) -> {
         if (!var1x.id_byte()) {
            this.id_package();
         }
      });
      this.id_class[id_case[0]] = var6;
      String var10003 = id_protected[2];
      Setting[] var10004 = new Setting[1];
      var10004[id_catch[2]] = (rrIk_1)this.id_class[id_case[1]];
      var1.id_class(new GroupSetting(var10003, var10004));
   }

   static {
      ntfClinit();
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(rrAC var1) {
      this.id_extends();
      if (var1.id_break() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[28]] && (Boolean)this.id_class[1]) {
         var1.id_class(true);
      }
   }

   private boolean id_class(rdn_3 var1) {
      return var1.id_break() != rdy_3.JA ? id_catch[15] : rAB.id_break(var1, List.of(rLD.id_final));
   }

   @Override
   public boolean id_class() {
      this.id_extends();
      return (Boolean)this.id_class[1];
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(rrLH var1) {
      this.id_extends();
      if (var1.id_protected() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[id_case[23]] && (Boolean)this.id_class[1]) {
         var1.id_class(true);
      }
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(rrLp_1 var1) {
      this.id_extends();
      rrLq_1 var2 = var1.id_case();
      if ((
            var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[1]
               || var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[id_case[26]]
         )
         && (Boolean)this.id_class[1]) {
         var1.id_class(true);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1853190394;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{30, -125, 24, -76, -57, -126, 54, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(q_1 var1) {
      this.id_extends();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_case[2]]) {
         AutoUse var2 = this.id_continue();
         if (!((rrIk_1)this.id_class[id_case[3]]).id_class() || !var2.id_class(this)) {
            this.id_break();
            return;
         }

         rdn_3 var3 = ((cb_3)id_import.id_class[57]).Sn();
         Pair var4 = this.id_break(var3);
         if (var4 == null) {
            this.id_break();
            return;
         }

         rdn_3 var5 = (rdn_3)var4.getLeft();
         int var6 = (Integer)var4.getRight();
         if (!this.id_byte()) {
            this.id_break();
            return;
         }

         this.id_private();
         int var7 = ((rJr_1)((cb_3)id_import.id_class[57]).id_implements[4]).id_case;
         if (var6 != -1 && var7 == 0 && !rdn_3.id_break(var3, var5)) {
            ((Ax_1)id_import.id_class[55]).id_class(var7, var6, 40, rXa_1.SWAP, id_catch[3]);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[8]]).id_finally().id_class(rrLY.id_class());
            Boolean var13 = id_catch[4];
            this.id_class[1] = var13;
            return;
         }

         if (!(Boolean)this.id_class[1] && !((cb_3)id_import.id_class[57]).id_return() && this.id_class(var3)) {
            ryZ_2 var8 = ((Ax_1)id_import.id_class[55]).id_class(rpm_3.OFF_HAND);
            if (var8.id_class()) {
               ((cb_3)id_import.id_class[57]).id_break(rpm_3.OFF_HAND);
               ((Hh_1)id_import.id_class[16]).id_class.id_class(rpm_3.OFF_HAND);
               Boolean var14 = true;
               this.id_class[1] = var14;
            }
         }

         if ((Boolean)this.id_class[1]) {
            if (!((cb_3)id_import.id_class[57]).id_return()) {
               Boolean var15 = id_catch[6];
               this.id_class[1] = var15;
            } else if (((cb_3)id_import.id_class[57]).Sw() > var3.id_extends() * 2) {
               ((Ax_1)id_import.id_class[55]).id_byte((cb_3)id_import.id_class[57]);
               Boolean var16 = id_catch[7];
               this.id_class[1] = var16;
            }
         }
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7353662504368329895L;
   }

   private Pair<rdn_3, Integer> id_break(rdn_3 var1) {
      if (this.id_class(var1)) {
         return Pair.of(var1, -1);
      } else {
         for (int var2 = id_catch[14]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (!var3.id_class() && this.id_class(var3)) {
               return Pair.of(var3, rrfY_2.id_break(var2));
            }
         }

         return null;
      }
   }

   public void id_break() {
      this.id_extends();
      Boolean var5 = id_catch[16];
      this.id_class[1] = var5;
   }

   private static void id_finally() {
      id_case = new short[]{
         0, 0, 0, 0, 57, 57, 4, 55, 0, 1, 1, 57, 55, 57, 16, 1, 1, 57, 1, 57, 55, 57, 1, 0, 1, 1, 0, 1, 0, 1, 1, 57, 1, 57, 55, 57, 57, 1, 1
      };
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         this.id_class[1] = false;
      }
   }

   private static void id_implements() {
      id_protected = new String[]{new String("Включено"), new String("enabled"), new String("Зелье невидимости")};
   }

   private void id_package() {
      this.id_extends();
      if ((Boolean)this.id_class[1] && ((cb_3)id_import.id_class[57]).id_return()) {
         ((Ax_1)id_import.id_class[55]).id_byte((cb_3)id_import.id_class[57]);
      }

      this.id_break();
   }

   private static void id_final() {
      id_break = new byte[]{-1, 40, 2, -1, 45, 2};
   }

   private static void id_native() {
      id_catch = new boolean[]{false, true, false, false, false, true, false, false, true, true, true, false, true, false, false, false, false, true, false};
   }

   @Override
   public boolean aK_() {
      this.id_package();
      return super.aK_();
   }
}
