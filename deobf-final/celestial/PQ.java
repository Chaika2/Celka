package celestial;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum PQ {
   private static boolean[] booleansbab060a493723b199065fc02333b4856;
   private static String[] stringsbab060a493723b199065fc02333b4856;

   static {
      ntfClinit();
   }

   private static void class_() {
      stringsbab060a493723b199065fc02333b4856 = new String[]{new String(",(?=[^,]*->)"), new String(","), new String("->")};
   }

   @Override
   public boolean class_(Type var1) {
      return Map.class.isAssignableFrom(Pc_1.class_(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7875803880347616302L;
   }

   @Override
   public Object class_(PN var1, String var2) {
      Type var3 = ((ParameterizedType)var1.class_().throws_()).getActualTypeArguments()[0];
      Type var4 = ((ParameterizedType)var1.class_().throws_()).getActualTypeArguments()[1];
      PW var5 = PW.break_(var3);
      PW var6 = PW.break_(var4);
      return Stream.of(var2.split(",(?=[^,]*->)"))
         .map(var0 -> var0.split("->"))
         .collect(Collectors.toMap(var2x -> var5.class_(var1, var2x[0]), var2x -> var6.class_(var1, var2x[1])));
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -704663813;
   }

   @Override
   public String class_(PN var1, Object var2) {
      Type var3 = ((ParameterizedType)var1.class_().throws_()).getActualTypeArguments()[0];
      Type var4 = ((ParameterizedType)var1.class_().throws_()).getActualTypeArguments()[1];
      PW var5 = PW.break_(var3);
      PW var6 = PW.break_(var4);
      return ((Map)var2)
         .entrySet()
         .stream()
         .map(var3x -> var5.class_(var1, var3x.getKey()) + "->" + var6.class_(var1, var3x.getValue()))
         .collect(Collectors.joining(","));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-117, 47, -58, -60, -8, 54, -110, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      booleansbab060a493723b199065fc02333b4856 = new boolean[]{false, true, false, true, true, false};
   }
}
