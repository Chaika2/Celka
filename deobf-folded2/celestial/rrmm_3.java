package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmm_3 extends C_try {
   private static short[] id_break;
   private static byte[] id_throws;
   private static String[] id_case;
   private static boolean[] id_catch;

   public rrmm_3(C_case var1) {
      super(var1, "rct", "reconnect");
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1154628499171429248L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      try {
         rrfq_3 var3 = (rrfq_3)rrfp_3.id_class[id_break[0]];
         if (var3 != null) {
            switch (((int[])rrmZ_2.id_class[id_break[1]])[var3.ordinal()]) {
               case 1:
                  this.id_class(var1, var2.id_break(id_catch[2]) ? this.id_private(var2.id_extends()) : id_case[2]);
                  return;
               case 2:
               case 3:
                  this.id_implements(var1);
                  return;
               case 4:
                  this.id_break(var1, var2.id_break(id_catch[3]) ? var2.id_extends() : id_case[3]);
                  return;
            }
         }

         rrfu_3.id_byte(id_case[4]);
      } catch (Exception var4) {
         rrfu_3.id_byte("Ошибка! Не подключайтесь так часто, либо укажите сервер в .rct");
         var4.printStackTrace();
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2083192812;
   }

   private void id_class(String var1, String var2) {
      String var3 = C_throws.id_byte().id_final().id_throws();
      boolean var4 = !var2.isEmpty() && !var2.isBlank() ? id_catch[7] : id_catch[6];
      if (var3.isEmpty() && var4) {
         rrfu_3.id_byte("Нету скорборда, либо укажите правильный режим");
      } else if (!rrfv_3.id_class((String)C_throws.id_break().id_protected.id_class[0] + var1, rrfZ_2.id_byte())) {
         ((cb_3)b_.id_class[57]).id_case("/hub");
         C_throws.id_byte().id_default().id_class(new SF(var4 ? var3 : var2.toLowerCase()));
      }
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6] && var2.id_case()
         ? new v_1().id_break(((Map)Pg_1.id_throws[1]).keySet().stream()).id_class(var2.id_extends()).id_protected()
         : Stream.empty();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 85, -76, 0, -22, 61, -11, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break(String var1, String var2) {
      C_class var3 = C_throws.id_byte();
      Po_1 var4 = var3.P().id_break();
      boolean var6 = !var2.isEmpty() && !var2.isBlank() ? id_catch[5] : id_catch[4];
      PK var5;
      if (var6) {
         if (var4 == null) {
            rrfu_3.id_byte("Не найден текущий режим");
            return;
         }

         var5 = var4.id_break();
         if (var5 == (PK)PK.staticFields6a264fee257833ddb403077ab7e90d84[6]) {
            rrfu_3.id_byte("Вы не можете использовать эту команду в лобби");
            return;
         }
      } else {
         var4 = Po_1.id_break(var2);
         if (var4 == null) {
            rrfu_3.id_byte("Неверно указан режим");
            return;
         }

         var5 = var4.id_break();
      }

      if (!rrfv_3.id_class((String)C_throws.id_break().id_protected.id_class[0] + var1, rrfZ_2.id_byte())) {
         ((cb_3)b_.id_class[57]).id_case("/hub");
         var3.id_default().id_class(new SF(var5.id_class() + var4.id_class()));
      }
   }

   private static void id_throws() {
      id_catch = new boolean[]{false, true, true, true, true, false, true, false, false, false, true, false, true};
   }

   private static void id_finally() {
      id_case = new String[]{
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
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return List.of("> %s%s - перезайти на текущий режим".formatted(var2, var1), "> %s%s <режим> - перезайти на нужный режим".formatted(var2, var1));
   }

   private static void id_extends() {
      id_throws = new byte[]{2, 2, 2};
   }

   private void id_implements(String var1) {
      C_class var2 = C_throws.id_byte();
      PI var3 = var2.id_native().id_protected();
      if (var3 == null) {
         rrfu_3.id_byte("Не найден текущий режим");
      } else {
         Pf_1 var4 = var3.id_class();
         if (var4 == (Pf_1)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[2]) {
            rrfu_3.id_byte("Вы не можете использовать эту команду в хабе");
         } else if (!rrfv_3.id_class((String)C_throws.id_break().id_protected.id_class[0] + var1, rrfZ_2.id_byte())) {
            ((cb_3)b_.id_class[57]).id_case("/hub");
            var2.id_default().id_class(new Sl_1(var4.id_class() + var3.id_break()));
         }
      }
   }

   @Override
   public String id_implements() {
      return "Команда для автоматического перезахода на режим (анархия, гриф и т.д)";
   }

   private static void id_protected() {
      id_break = new short[]{1, 0, 2, 0, 57, 6, 0, 57, 0, 57, 1, 0, 1, 6, 1, 0};
   }

   private String id_private(String var1) {
      return (rrfq_3)rrfp_3.id_class[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
            || !var1.equalsIgnoreCase("mega") && !var1.equalsIgnoreCase("мега")
         ? var1.replaceAll("\\D", "")
         : var1;
   }
}
