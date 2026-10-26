package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sp_3 extends C_try {
   private static short[] break_;
   private static byte[] throws_;
   private static String[] case_;
   private static boolean[] catch_;

   public sp_3(C_case var1) {
      super(var1, "follow");
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1375122442;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5368074698062264005L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.private_(1);
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      sq_3 var3;
      if (var2.case_()) {
         ((C_case)this.class_[0]).public_().break_((Predicate<an_3>)(var3 = var2.implements_(sq_3.class)).fields7c97b86bc96f32548c9e3133b384faa8[0]);
      } else {
         var2.private_(2);
         var3 = null;
         sT_2 var4 = var2.implements_(sT_2.class);

         while (var2.final_()) {
            Object var7 = var2.break_((C_double)var4.fieldsd035b37d0ef43a14a807173dd90a9560[0]);
            if (var7 instanceof aI_2) {
               var6.add((aI_2)var7);
            } else if (var7 != null) {
               var5.add((an_3)var7);
            }
         }

         ((C_case)this.class_[0]).public_().break_(var6.isEmpty() ? var5::contains : var1x -> var6.stream().anyMatch(var1xx -> var1x.BC().equals(var1xx)));
      }

      if (var3 != null) {
         this.case_(String.format("Преследуем всех %s", var3.name().toLowerCase(Locale.US)));
      } else if (var6.isEmpty()) {
         if (var5.isEmpty()) {
            throw new st_3();
         }

         this.case_("Преследуем этих существ:");
         var5.stream().map(an_3::toString).forEach(this::case_);
      } else {
         this.case_("Приследуем этот тип существ:");
         var6.stream().map(rVL.transient_::break_).map(Objects::requireNonNull).map(rqO_2::toString).forEach(this::case_);
      }
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_(sq_3.class).break_(sT_2.class).class_(var2.extends_()).protected_();
      } else {
         C_double var3;
         try {
            var3 = (C_double)var2.implements_(sT_2.class).fieldsd035b37d0ef43a14a807173dd90a9560[break_[4]];
         } catch (NullPointerException var5) {
            return Stream.empty();
         }

         while (var2.break_(2)) {
            if (var2.byte_(var3) == null) {
               return Stream.empty();
            }

            var2.throws_();
         }

         return var2.class_(var3);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, -78, -69, -108, -87, 75, -10, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      catch_ = new boolean[]{true, false, true, true, false, false, true, true};
   }

   private static void finally_() {
      case_ = new String[]{
         new String("follow"),
         new String("Преследуем всех %s"),
         new String("Преследуем этих существ:"),
         new String("Приследуем этот тип существ:"),
         new String("Преследовать какое либо существо"),
         new String("Команда \"follow\" указывает Baritone следовать за определенными существами."),
         new String(""),
         new String("Использвание:"),
         new String("> follow entities - приследует всех сущевств."),
         new String("> follow entity <entity1> <entity2> <...> - Следовать определенным сущностям (например, \"скелет\", \"лошадь\" и т.д.)"),
         new String("> follow players - прислудет игроков"),
         new String("> follow player <username1> <username2> <...> - приследует опредленных игроков")
      };
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "Команда \"follow\" указывает Baritone следовать за определенными существами.",
         "",
         "Использвание:",
         "> follow entities - приследует всех сущевств.",
         "> follow entity <entity1> <entity2> <...> - Следовать определенным сущностям (например, \"скелет\", \"лошадь\" и т.д.)",
         "> follow players - прислудет игроков",
         "> follow player <username1> <username2> <...> - приследует опредленных игроков"
      );
   }

   private static void extends_() {
      throws_ = new byte[]{2, 2, 7, 2, 3, 4, 5, 6};
   }

   @Override
   public boolean case_() {
      return true;
   }

   @Override
   public String implements_() {
      return "Преследовать какое либо существо";
   }

   private static void protected_() {
      break_ = new short[5];
   }
}
