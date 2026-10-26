package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqv_3 implements rrqd_3 {
   private static String[] class_;
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new short[]{0, 2000, 2000, 0, 2000, 0, 2000, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000, 0, 2000};
   }

   static {
      ntfClinit();
   }

   public String class_(rrqz_3 var1) {
      return "'" + var1.byte_().native_().getString() + "'";
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2195071498924816906L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-86, 61, 127, 64, 35, 118, -107, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new boolean[]{false, false, false, true, false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2146429053;
   }

   @Override
   public void class_(Collection<rrqz_3> var1) {
      if (var1.isEmpty()) {
         String var9 = "Сканирование завершено";
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3("X-Ray", var9, 2000));
         rrfu_3.byte_(var9);
         MinecraftAccessor.a_("X-Ray: " + var9, false);
      } else {
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3("X-Ray", "Сканирование завершено", 2000));
         MinecraftAccessor.a_("X-Ray: Сканирование завершено", false);
         HashMap var2 = new HashMap();
         rgN_2 var3 = new rgN_2(rgF_2.GRAY + "Сканирование завершено, найдено:\n");

         for (rrqz_3 var5 : var1) {
            String var6 = var5.byte_().native_().getString();
            var2.put(var6, var2.getOrDefault(var6, 0) + 1);
         }

         int var10 = byte_[4];

         for (Entry var12 : var2.entrySet()) {
            String var7 = (String)var12.getKey();
            Integer var8 = (Integer)var12.getValue();
            var3.break_(rgF_2.GRAY + "- " + rgF_2.WHITE + var7).break_(" ").break_(rgF_2.RED + "x" + var8);
            if (var10 != var2.size() - 1) {
               var3.break_("\n");
            }

            var10++;
         }

         rrfu_3.class_((rVi_1)var3);
      }
   }

   @Override
   public void class_(rrqz_3 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " добавлен в список" : class_[1]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("X-Ray", var3, 2000) : new rrtx_3("X-Ray", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   @Override
   public void class_(String var1, Exception var2) {
      String var3 = "'" + var1 + "'";
      String var4 = "Ошибка при добавлении " + var3;
      if (var2 instanceof u_1 var5 && var5.getMessage().equals("Block not found")) {
         var4 = "Блок " + var3 + " не найден или является воздухом";
      }

      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("X-Ray", var4, 2000));
      rrfu_3.byte_(var4);
   }

   @Override
   public void break_(rrqz_3 var1, boolean var2) {
      String var3 = this.class_(var1) + (var2 ? " удалён из списка" : class_[7]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0])
         .class_((rrtO_2)(var2 ? new rrtQ_2("X-Ray", var3, 2000) : new rrtx_3("X-Ray", var3, 2000)));
      rrfu_3.byte_(var3);
   }

   private static void protected_() {
      class_ = new String[]{
         new String(" добавлен в список"),
         new String(" уже есть в списке"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("Block not found"),
         new String("X-Ray"),
         new String(" удалён из списка"),
         new String(" не найден в списке"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("Список блоков очищен"),
         new String("X-Ray"),
         new String("Список блоков пуст"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("возобновлён"),
         new String("остановлен"),
         new String("X-Ray"),
         new String("Сканирование завершено"),
         new String("X-Ray"),
         new String("X-Ray"),
         new String("Сканирование завершено"),
         new String("X-Ray: Сканирование завершено"),
         new String(" "),
         new String("\n")
      };
   }

   @Override
   public void a_(String var1) {
      String var2 = "'" + var1 + "' не найден в списке";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("X-Ray", var2, 2000));
      rrfu_3.byte_(var2);
   }

   @Override
   public void g_(boolean var1) {
      String var2 = "X-Ray был " + (var1 ? "возобновлён" : class_[16]);
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtd_3("X-Ray", var2, 2000));
      rrfu_3.byte_(var2);
   }

   @Override
   public void g_() {
      String var1 = "Список блоков очищен";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("X-Ray", var1, 2000));
      rrfu_3.byte_(var1);
   }

   @Override
   public void f_() {
      String var1 = "Список блоков пуст";
      ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("X-Ray", var1, 2000));
      rrfu_3.byte_(var1);
   }
}
