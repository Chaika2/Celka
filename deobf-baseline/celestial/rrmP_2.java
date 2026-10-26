package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmP_2 implements rruT<rryk_1>, rruq_1 {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new boolean[]{true, false, true, false, true};
   }

   rrmP_2(rrua_1 var1) {
      this.id_protected();
      this.id_class[id_protected[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public rVe_1 id_class(rryk_1 var1) {
      String var2 = var1.id_break();
      String var3 = var1.id_class();
      rVe_1 var4 = new rVe_1(id_break[0]);
      var4.id_class(new rgN_2(id_break[1]).id_class(var4.id_class().id_class(rgF_2.RED)));
      rVe_1 var5 = new rVe_1(id_break[2]);
      var5.id_class(var5.id_class().id_class(rgF_2.GRAY));
      String var10001 = id_break[3];
      CharSequence[] var10002 = new CharSequence[id_byte[0]];
      var10002[id_byte[1]] = "Нажмите чтобы удалить '" + var2 + "' из чёрного списка";
      var5.id_class(String.join(var10001, var10002));
      if (var3 != null) {
         var5.id_class("\nЗаметка: " + var3);
      } else {
         var5.id_class(id_break[4]);
      }

      var4.id_class(var4.id_class().id_class(new rgy_3(rgp_3.id_class, var5)));
      rVe_1 var6 = rrfu_3.id_class((Object)var2).id_break();
      var6.id_class(var6.id_class().id_class(rgF_2.GRAY));
      var6.id_class(var4);
      var6.id_class(
         var6.id_class()
            .id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_protected[5]] + "duel blacklist remove " + var2))
      );
      return var6;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 822262359;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -122, 77, -84, -85, -93, -12, 72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_protected = new short[7];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1660274982194236217L;
   }

   @Override
   public void id_class(C_static var1) {
      ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[1]]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         rrua_1 var10000 = (rrua_1)this.id_class[id_protected[6]];
         rVi_1[] var10001 = new rVi_1[id_byte[2]];
         var10001[id_byte[3]] = var2;
         var10000.id_class(var10001);
      });
      if (!((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[2]]).id_break().isEmpty()) {
         ((rrua_1)this.id_class[id_protected[3]])
            .id_case("Всего в чёрном списке: " + ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_protected[4]]).id_class());
      }
   }

   private static void id_break() {
      id_break = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n"), new String("\nЗаметка отсутствует")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[4]];
         Object[] var1 = this.id_class;
      }
   }
}
