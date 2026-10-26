package celestial;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.BitSet;
import java.util.Map;
import java.util.stream.Stream;

public class roz_3 extends rok_3 {
   private final roJ_2 class_;

   @Override
   public roQ_2[] byte_() {
      return this.class_.byte_();
   }

   @Override
   public xc_3 byte_(rfH_2 var1) {
      return this.class_.byte_(var1);
   }

   public roz_3(roJ_2 var1) {
      super(var1.private_(), rVh_1.class_);
      this.class_ = var1;
   }

   @Override
   public void class_(rrrZ<?> var1, long var2) {
   }

   @Override
   public Map<rrrZ<?>, LongSet> class_() {
      return this.class_.class_();
   }

   @Override
   public rrrH<?> class_(rrrZ<?> var1) {
      return this.class_.class_(var1);
   }

   @Override
   public void class_(rrrZ<?> var1, rrrH<?> var2) {
   }

   @Override
   public void class_(long var1) {
   }

   @Override
   public BitSet class_(rKu_1 var1) {
      throw (UnsupportedOperationException)rqR_2.byte_(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public void class_(rYZ var1) {
   }

   @Override
   public void class_(rcd_3 var1) {
   }

   @Override
   public void class_(Map<rrrZ<?>, LongSet> var1) {
   }

   @Override
   public void class_(rKv_1 var1, long[] var2) {
   }

   @Override
   public void class_(roN_2 var1) {
   }

   @Override
   public ryO_2 class_(rfH_2 var1) {
      return this.class_.class_(var1);
   }

   @Override
   public void class_(rfH_2 var1, ryO_2 var2) {
   }

   @Override
   public xc_3 class_(rfH_2 var1, xc_3 var2, boolean var3) {
      return null;
   }

   @Override
   public void class_(an_3 var1) {
   }

   @Override
   public int class_(rKv_1 var1, int var2, int var3) {
      return this.class_.class_(this.break_(var1), var2, var3);
   }

   private rKv_1 break_(rKv_1 var1) {
      if (var1 == rKv_1.WORLD_SURFACE_WG) {
         return rKv_1.WORLD_SURFACE;
      } else {
         return var1 == rKv_1.OCEAN_FLOOR_WG ? rKv_1.OCEAN_FLOOR : var1;
      }
   }

   @Override
   public LongSet break_(rrrZ<?> var1) {
      return this.class_.break_(var1);
   }

   @Override
   public rXE break_(rfH_2 var1) {
      return this.class_.break_(var1);
   }

   @Override
   public BitSet break_(rKu_1 var1) {
      throw (UnsupportedOperationException)rqR_2.byte_(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public void break_(Map<rrrZ<?>, rrrH<?>> var1) {
   }

   @Override
   public void break_(boolean var1) {
   }

   @Override
   public void throws_(rfH_2 var1) {
   }

   @Override
   public roW_2<xd_3> finally_() {
      return new roW_2<>(var0 -> var0.continue_().catch_(), this.private_());
   }

   @Override
   public rrse_3 catch_() {
      return this.class_.protected_();
   }

   @Override
   public roW_2<rXs_1> extends_() {
      return new roW_2<>(var0 -> var0 == rXG.class_, this.private_());
   }

   @Override
   public void extends_(rfH_2 var1) {
   }

   @Override
   public roN_2 goto_() {
      return this.class_.goto_();
   }

   @Override
   public rcd_3 case_(rfH_2 var1) {
      return this.class_.case_(var1);
   }

   @Override
   public boolean continue_() {
      return false;
   }

   @Override
   public rYZ implements_() {
      return this.class_.implements_();
   }

   @Override
   public Stream<rfH_2> package_() {
      return this.class_.package_();
   }

   @Override
   public Map<rrrZ<?>, rrrH<?>> super_() {
      return this.class_.super_();
   }

   @Override
   public boolean throw_() {
      return this.class_.throw_();
   }

   @Override
   public int while_() {
      return this.class_.while_();
   }

   @Override
   public rcd_3 protected_(rfH_2 var1) {
      return this.class_.protected_(var1);
   }

   @Override
   public void protected_(boolean var1) {
      this.class_.protected_(var1);
   }

   @Override
   public rfj_3 private_() {
      return this.class_.private_();
   }

   public roJ_2 final_() {
      return this.class_;
   }
}
