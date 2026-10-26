package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrfL_2 implements MinecraftAccessor {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static String[] throws_;

   private static void byte_() {
      break_ = new boolean[1];
   }

   public rrfL_2() {
      this.throws_();
      ArrayList var5 = new ArrayList();
      this.class_[0] = var5;
      Comparator var6 = Comparator.comparingInt(var1 -> -((List)this.class_[0]).indexOf(var1.getKey()));
      this.class_[1] = var6;
   }

   static {
      ntfClinit();
   }

   public Pair<String, Integer> class_(rdn_3 var1) {
      StringBuilder var2 = new StringBuilder();
      Map var3 = ((List)this.class_[0]).isEmpty() ? var1.static_() : var1.class_((List<ev_3>)this.class_[0]);
      var3.entrySet()
         .stream()
         .sorted((Comparator)this.class_[1])
         .forEach(var2x -> var2.append(this.class_((ev_3)var2x.getKey(), (Integer)var2x.getValue(), 0, 2)).append("\n"));
      return Pair.of(var2.toString(), var3.size());
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-42, 77, 33, -63, -15, -109, 19, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrfL_2 class_(Comparator<Entry<ev_3, Integer>> var1) {
      this.class_[1] = var1;
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1840660222102227268L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 796712611;
   }

   private static void class_() {
      throws_ = new String[]{new String("\n")};
   }

   public String class_(ev_3 var1, int var2, int var3, int var4) {
      rgn_3 var5 = new rgn_3(var1.catch_());
      return var5.getString().substring(var3, var4) + var2;
   }

   public rrfL_2 class_(ev_3... var1) {
      List var6 = List.of(var1);
      this.class_[0] = var6;
      return this;
   }

   private static void break_() {
      byte_ = new byte[]{2, 2};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private static void protected_() {
      protected_ = new short[]{0, 1, 0, 0, 1, 0, 1, 0};
   }
}
