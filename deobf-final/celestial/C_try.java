package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class C_try implements C_interface {
   private static boolean[] break_;
   private static short[] throws_;
   private static byte[] case_;
   private static String[] catch_;
   public Object[] class_;

   @Override
   public x_1 byte_() {
      return null;
   }

   public C_try(C_case var1, String... var2) {
      this.native_();
      List var7 = Stream.of(var2).map(var0 -> var0.toLowerCase(Locale.US)).toList();
      this.class_[2] = var7;
      this.class_[0] = var1;
      Ps_1 var9 = var1.throw_();
      this.class_[1] = var9;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -56, -68, 69, -16, 46, -88, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1153100300;
   }

   @Override
   public rVi_1 class_() {
      rVi_1 var1 = new rVe_1("Наведите мышь, чтобы увидеть подробное описание команды ").class_(new rgN_2("'" + this.break_().get(0) + "'").break_(rgF_2.RED));
      rVe_1 var2 = new rVe_1(this.implements_() + "\n\n" + String.join("\n", this.catch_()));
      var1.class_(var1.class_().class_(rgF_2.GRAY));
      var2.class_(var2.class_().class_(rgF_2.GRAY));
      return rgv_3.class_(
         var1, new rgy_3(rgp_3.class_, var2), new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.instanceof_().protected_.class_[0] + this.break_().get(0) + " ")
      );
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8915527887891206725L;
   }

   @Override
   public List<String> break_() {
      return (List<String>)this.class_[2];
   }

   private static void throws_() {
      break_ = new boolean[2];
   }

   private static void finally_() {
      catch_ = new String[]{new String("Наведите мышь, чтобы увидеть подробное описание команды "), new String("\n")};
   }

   private static void extends_() {
      case_ = new byte[]{3};
   }

   private static void protected_() {
      throws_ = new short[]{2, 0, 1, 0, 2};
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }
}
