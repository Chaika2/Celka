package celestial;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.concurrent.atomic.AtomicInteger;

public class xc_3 extends JC implements rrGf_1 {
   public static final Codec<xc_3> break_ = class_(rVL.strictfp_, xd_3::continue_).stable();
   private int throws_ = -1;
   private int case_ = -1;
   private rqO_2 catch_;
   private int private_ = -1;
   private static final AtomicInteger implements_ = new AtomicInteger(0);

   @Override
   protected xc_3 int_() {
      return this;
   }

   public xc_3(xd_3 var1, ImmutableMap<rCZ<?>, Comparable<?>> var2, MapCodec<xc_3> var3) {
      super(var1, var2, var3);
   }

   public rqO_2 this_() {
      if (this.catch_ == null) {
         this.catch_ = rVL.strictfp_.break_(this.break_());
      }

      return this.catch_;
   }

   public int continue_() {
      if (this.throws_ < 0) {
         this.throws_ = rVL.strictfp_.class_(this.break_());
      }

      return this.throws_;
   }

   public int continue_(rRq_1 var1, rfH_2 var2) {
      return this.case_();
   }

   public int else_() {
      if (this.private_ < 0) {
         this.private_ = implements_.incrementAndGet();
      }

      return this.private_;
   }

   public boolean return_() {
      return this.class_ != null && this.class_.protected_;
   }

   public int super_() {
      if (this.case_ < 0) {
         this.case_ = rrWP.class_(this);
         if (this.case_ < 0) {
            rrbb_3.protected_("Metadata not found, block: " + this.this_());
            this.case_ = 0;
         }
      }

      return this.case_;
   }

   public boolean synchronized_() {
      return this.class_ != null && this.class_.class_;
   }
}
