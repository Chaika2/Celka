package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmm_3 extends C_try {
   private static short[] break_;
   private static byte[] throws_;
   private static String[] case_;
   private static boolean[] catch_;

   public rrmm_3(C_case var1) {
      super(var1, "rct", "reconnect");
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1154628499171429248L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      try {
         rrfq_3 var3 = (rrfq_3)rrfp_3.class_[break_[0]];
         if (var3 != null) {
            switch (((int[])rrmZ_2.class_[break_[1]])[var3.ordinal()]) {
               case 1:
                  this.class_(var1, var2.break_(catch_[2]) ? this.private_(var2.extends_()) : case_[2]);
                  return;
               case 2:
               case 3:
                  this.implements_(var1);
                  return;
               case 4:
                  this.break_(var1, var2.break_(catch_[3]) ? var2.extends_() : case_[3]);
                  return;
            }
         }

         rrfu_3.byte_(case_[4]);
      } catch (Exception var4) {
         rrfu_3.byte_("Ошибка! Не подключайтесь так часто, либо укажите сервер в .rct");
         var4.printStackTrace();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2083192812;
   }

   private void class_(String var1, String var2) {
      String var3 = C_throws.byte_().final_().throws_();
      boolean var4 = !var2.isEmpty() && !var2.isBlank() ? catch_[7] : catch_[6];
      if (var3.isEmpty() && var4) {
         rrfu_3.byte_("Нету скорборда, либо укажите правильный режим");
      } else if (!rrfv_3.class_((String)C_throws.break_().protected_.class_[0] + var1, rrfZ_2.byte_())) {
         ((cb_3)b_.class_[57]).case_("/hub");
         C_throws.byte_().default_().class_(new SF(var4 ? var3 : var2.toLowerCase()));
      }
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6] && var2.case_()
         ? new v_1().break_(((Map)Pg_1.throws_[1]).keySet().stream()).class_(var2.extends_()).protected_()
         : Stream.empty();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 85, -76, 0, -22, 61, -11, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_(String var1, String var2) {
      C_class var3 = C_throws.byte_();
      Po_1 var4 = var3.P().break_();
      boolean var6 = !var2.isEmpty() && !var2.isBlank() ? catch_[5] : catch_[4];
      PK var5;
      if (var6) {
         if (var4 == null) {
            rrfu_3.byte_("Не найден текущий режим");
            return;
         }

         var5 = var4.break_();
         if (var5 == (PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[6]) {
            rrfu_3.byte_("Вы не можете использовать эту команду в лобби");
            return;
         }
      } else {
         var4 = Po_1.break_(var2);
         if (var4 == null) {
            rrfu_3.byte_("Неверно указан режим");
            return;
         }

         var5 = var4.break_();
      }

      if (!rrfv_3.class_((String)C_throws.break_().protected_.class_[0] + var1, rrfZ_2.byte_())) {
         ((cb_3)b_.class_[57]).case_("/hub");
         var3.default_().class_(new SF(var5.class_() + var4.class_()));
      }
   }

   private static void throws_() {
      catch_ = new boolean[]{false, true, true, true, true, false, true, false, false, false, true, false, true};
   }

   private static void finally_() {
      case_ = new String[]{
         new String("rct"),
         new String("reconnect"),
         new String(""),
         new String(""),
         new String("Эта команда не работает на этом сервере"),
         new String("Ошибка! Не подключайтесь так часто, либо укажите сервер в .rct"),
         new String("Не найден текущий режим"),
         new String("Вы не можете использовать эту команду в хабе"),
         new String("/hub"),
         new String("Не найден текущий режим"),
         new String("Вы не можете использовать эту команду в лобби"),
         new String("Неверно указан режим"),
         new String("/hub"),
         new String("Нету скорборда, либо укажите правильный режим"),
         new String("/hub"),
         new String("mega"),
         new String("мега"),
         new String("\\D"),
         new String(""),
         new String("Команда для автоматического перезахода на режим (анархия, гриф и т.д)"),
         new String("> %s%s - перезайти на текущий режим"),
         new String("> %s%s <режим> - перезайти на нужный режим")
      };
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return List.of("> %s%s - перезайти на текущий режим".formatted(var2, var1), "> %s%s <режим> - перезайти на нужный режим".formatted(var2, var1));
   }

   private static void extends_() {
      throws_ = new byte[]{2, 2, 2};
   }

   private void implements_(String var1) {
      C_class var2 = C_throws.byte_();
      PI var3 = var2.native_().protected_();
      if (var3 == null) {
         rrfu_3.byte_("Не найден текущий режим");
      } else {
         Pf_1 var4 = var3.class_();
         if (var4 == (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            rrfu_3.byte_("Вы не можете использовать эту команду в хабе");
         } else if (!rrfv_3.class_((String)C_throws.break_().protected_.class_[0] + var1, rrfZ_2.byte_())) {
            ((cb_3)b_.class_[57]).case_("/hub");
            var2.default_().class_(new Sl_1(var4.class_() + var3.break_()));
         }
      }
   }

   @Override
   public String implements_() {
      return "Команда для автоматического перезахода на режим (анархия, гриф и т.д)";
   }

   private static void protected_() {
      break_ = new short[]{1, 0, 2, 0, 57, 6, 0, 57, 0, 57, 1, 0, 1, 6, 1, 0};
   }

   private String private_(String var1) {
      return (rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
            || !var1.equalsIgnoreCase("mega") && !var1.equalsIgnoreCase("мега")
         ? var1.replaceAll("\\D", "")
         : var1;
   }
}
