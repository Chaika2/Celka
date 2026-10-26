package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sy_3 extends C_try {
   private static boolean[] break_;
   private static short[] throws_;
   private static String[] case_;
   private static byte[] catch_;
   private static int[] private_;

   public sy_3(C_case var1) {
      super(var1, "find");
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      var2.private_(1);
      ArrayList var3 = new ArrayList();

      while (var2.final_()) {
         var3.add((xd_3)var2.break_((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[0]));
      }

      rU_2 var4 = ((Ps_1)this.class_[1]).volatile_();
      rVe_1[] var5 = var3.stream()
         .flatMap(
            var2x -> ((Ps_1)this.class_[1])
                  .package_()
                  .break_()
                  .class_(rVL.strictfp_.break_(var2x).break_(), Integer.MAX_VALUE, (Integer)var4.break_[0], (Integer)var4.break_[1], 4)
                  .stream()
         )
         .map(rU_2::new)
         .map(this::class_)
         .toArray(rVe_1[]::new);
      if (var5.length > 0) {
         Arrays.asList(var5).forEach(var1x -> this.class_(new rVi_1[]{var1x}));
      } else {
         this.case_("No positions known, are you sure the blocks are cached?");
      }
   }

   private rgP_2 class_(rU_2 var1) {
      String var2 = String.format("%s %s %s", (Integer)var1.break_[0], (Integer)var1.break_[1], (Integer)var1.break_[2]);
      String var3 = String.format("%sgoal %s", C_throw.class_, var2);
      rgN_2 var4 = new rgN_2(var1.toString());
      rgN_2 var5 = new rgN_2("Click to set goal to this position");
      var4.class_(var4.class_().class_(rgF_2.GRAY).class_(var2).class_(new rgl_3(rgH_2.RUN_COMMAND, var3)).class_(new rgy_3(rgp_3.class_, var5)));
      return var4;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4554528706868903580L;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return new v_1()
         .break_(((ImmutableSet)St_1.class_[0]).stream().map(rVL.strictfp_::break_).map(Object::toString))
         .break_(var2.extends_())
         .break_()
         .protected_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-61, -71, 92, -117, 105, -62, -89, -95}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -925919029;
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, true, false, true, false, true, false, true, true, false};
   }

   private static void finally_() {
      private_ = new int[]{Integer.MAX_VALUE};
   }

   @Override
   public List<String> catch_() {
      return Arrays.asList(
         "The find command searches through Baritone's cache and attempts to find the location of the block.",
         "Tab completion will suggest only cached blocks and uncached blocks can not be found.",
         "",
         "Usage:",
         "> find <block> [...] - Try finding the listed blocks"
      );
   }

   private static void extends_() {
      throws_ = new short[]{0, 1, 0, 1, 2, 0, 1, 0, 1};
   }

   @Override
   public String implements_() {
      return "Find positions of a certain block";
   }

   private static void protected_() {
      case_ = new String[]{
         new String("find"),
         new String("No positions known, are you sure the blocks are cached?"),
         new String("%s %s %s"),
         new String("%sgoal %s"),
         new String("Click to set goal to this position"),
         new String("Find positions of a certain block"),
         new String("The find command searches through Baritone's cache and attempts to find the location of the block."),
         new String("Tab completion will suggest only cached blocks and uncached blocks can not be found."),
         new String(""),
         new String("Usage:"),
         new String("> find <block> [...] - Try finding the listed blocks")
      };
   }

   private static void native_() {
      catch_ = new byte[]{3, 2, 2, 5, 2, 3, 4, 4};
   }
}
