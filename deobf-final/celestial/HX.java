package celestial;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.KHRDebug;

public class HX {
   private static final Logger protected_ = LogManager.getLogger();
   protected static final ByteBuffer class_ = Hb_1.class_(64);
   protected static final FloatBuffer break_ = class_.asFloatBuffer();
   protected static final IntBuffer byte_ = class_.asIntBuffer();
   private static final Joiner throws_ = Joiner.on('\n');
   private static final Joiner case_ = Joiner.on("; ");
   private static final Map<Integer, String> catch_ = Maps.newHashMap();
   private static final List<Integer> private_ = ImmutableList.of(37190, 37191, 37192, 33387);
   private static final List<Integer> implements_ = ImmutableList.of(37190, 37191, 37192);
   private static final Map<String, List<String>> finally_ = Maps.newHashMap();
   private static final int[] extends_ = class_();

   private static String byte_(int var0) {
      switch (var0) {
         case 33356:
            return "ERROR";
         case 33357:
            return "DEPRECATED BEHAVIOR";
         case 33358:
            return "UNDEFINED BEHAVIOR";
         case 33359:
            return "PORTABILITY";
         case 33360:
            return "PERFORMANCE";
         case 33361:
            return "OTHER";
         case 33384:
            return "MARKER";
         default:
            return class_(var0);
      }
   }

   static {
      class_(256, "GL11.GL_ACCUM");
      class_(257, "GL11.GL_LOAD");
      class_(258, "GL11.GL_RETURN");
      class_(259, "GL11.GL_MULT");
      class_(260, "GL11.GL_ADD");
      class_(512, "GL11.GL_NEVER");
      class_(513, "GL11.GL_LESS");
      class_(514, "GL11.GL_EQUAL");
      class_(515, "GL11.GL_LEQUAL");
      class_(516, "GL11.GL_GREATER");
      class_(517, "GL11.GL_NOTEQUAL");
      class_(518, "GL11.GL_GEQUAL");
      class_(519, "GL11.GL_ALWAYS");
      class_(0, "GL11.GL_POINTS");
      class_(1, "GL11.GL_LINES");
      class_(2, "GL11.GL_LINE_LOOP");
      class_(3, "GL11.GL_LINE_STRIP");
      class_(4, "GL11.GL_TRIANGLES");
      class_(5, "GL11.GL_TRIANGLE_STRIP");
      class_(6, "GL11.GL_TRIANGLE_FAN");
      class_(7, "GL11.GL_QUADS");
      class_(8, "GL11.GL_QUAD_STRIP");
      class_(9, "GL11.GL_POLYGON");
      class_(0, "GL11.GL_ZERO");
      class_(1, "GL11.GL_ONE");
      class_(768, "GL11.GL_SRC_COLOR");
      class_(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
      class_(770, "GL11.GL_SRC_ALPHA");
      class_(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
      class_(772, "GL11.GL_DST_ALPHA");
      class_(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
      class_(774, "GL11.GL_DST_COLOR");
      class_(775, "GL11.GL_ONE_MINUS_DST_COLOR");
      class_(776, "GL11.GL_SRC_ALPHA_SATURATE");
      class_(32769, "GL14.GL_CONSTANT_COLOR");
      class_(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
      class_(32771, "GL14.GL_CONSTANT_ALPHA");
      class_(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
      class_(1, "GL11.GL_TRUE");
      class_(0, "GL11.GL_FALSE");
      class_(12288, "GL11.GL_CLIP_PLANE0");
      class_(12289, "GL11.GL_CLIP_PLANE1");
      class_(12290, "GL11.GL_CLIP_PLANE2");
      class_(12291, "GL11.GL_CLIP_PLANE3");
      class_(12292, "GL11.GL_CLIP_PLANE4");
      class_(12293, "GL11.GL_CLIP_PLANE5");
      class_(5120, "GL11.GL_BYTE");
      class_(5121, "GL11.GL_UNSIGNED_BYTE");
      class_(5122, "GL11.GL_SHORT");
      class_(5123, "GL11.GL_UNSIGNED_SHORT");
      class_(5124, "GL11.GL_INT");
      class_(5125, "GL11.GL_UNSIGNED_INT");
      class_(5126, "GL11.GL_FLOAT");
      class_(5127, "GL11.GL_2_BYTES");
      class_(5128, "GL11.GL_3_BYTES");
      class_(5129, "GL11.GL_4_BYTES");
      class_(5130, "GL11.GL_DOUBLE");
      class_(0, "GL11.GL_NONE");
      class_(1024, "GL11.GL_FRONT_LEFT");
      class_(1025, "GL11.GL_FRONT_RIGHT");
      class_(1026, "GL11.GL_BACK_LEFT");
      class_(1027, "GL11.GL_BACK_RIGHT");
      class_(1028, "GL11.GL_FRONT");
      class_(1029, "GL11.GL_BACK");
      class_(1030, "GL11.GL_LEFT");
      class_(1031, "GL11.GL_RIGHT");
      class_(1032, "GL11.GL_FRONT_AND_BACK");
      class_(1033, "GL11.GL_AUX0");
      class_(1034, "GL11.GL_AUX1");
      class_(1035, "GL11.GL_AUX2");
      class_(1036, "GL11.GL_AUX3");
      class_(0, "GL11.GL_NO_ERROR");
      class_(1280, "GL11.GL_INVALID_ENUM");
      class_(1281, "GL11.GL_INVALID_VALUE");
      class_(1282, "GL11.GL_INVALID_OPERATION");
      class_(1283, "GL11.GL_STACK_OVERFLOW");
      class_(1284, "GL11.GL_STACK_UNDERFLOW");
      class_(1285, "GL11.GL_OUT_OF_MEMORY");
      class_(1536, "GL11.GL_2D");
      class_(1537, "GL11.GL_3D");
      class_(1538, "GL11.GL_3D_COLOR");
      class_(1539, "GL11.GL_3D_COLOR_TEXTURE");
      class_(1540, "GL11.GL_4D_COLOR_TEXTURE");
      class_(1792, "GL11.GL_PASS_THROUGH_TOKEN");
      class_(1793, "GL11.GL_POINT_TOKEN");
      class_(1794, "GL11.GL_LINE_TOKEN");
      class_(1795, "GL11.GL_POLYGON_TOKEN");
      class_(1796, "GL11.GL_BITMAP_TOKEN");
      class_(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
      class_(1798, "GL11.GL_COPY_PIXEL_TOKEN");
      class_(1799, "GL11.GL_LINE_RESET_TOKEN");
      class_(2048, "GL11.GL_EXP");
      class_(2049, "GL11.GL_EXP2");
      class_(2304, "GL11.GL_CW");
      class_(2305, "GL11.GL_CCW");
      class_(2560, "GL11.GL_COEFF");
      class_(2561, "GL11.GL_ORDER");
      class_(2562, "GL11.GL_DOMAIN");
      class_(2816, "GL11.GL_CURRENT_COLOR");
      class_(2817, "GL11.GL_CURRENT_INDEX");
      class_(2818, "GL11.GL_CURRENT_NORMAL");
      class_(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
      class_(2820, "GL11.GL_CURRENT_RASTER_COLOR");
      class_(2821, "GL11.GL_CURRENT_RASTER_INDEX");
      class_(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
      class_(2823, "GL11.GL_CURRENT_RASTER_POSITION");
      class_(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
      class_(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
      class_(2832, "GL11.GL_POINT_SMOOTH");
      class_(2833, "GL11.GL_POINT_SIZE");
      class_(2834, "GL11.GL_POINT_SIZE_RANGE");
      class_(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
      class_(2848, "GL11.GL_LINE_SMOOTH");
      class_(2849, "GL11.GL_LINE_WIDTH");
      class_(2850, "GL11.GL_LINE_WIDTH_RANGE");
      class_(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
      class_(2852, "GL11.GL_LINE_STIPPLE");
      class_(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
      class_(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
      class_(2864, "GL11.GL_LIST_MODE");
      class_(2865, "GL11.GL_MAX_LIST_NESTING");
      class_(2866, "GL11.GL_LIST_BASE");
      class_(2867, "GL11.GL_LIST_INDEX");
      class_(2880, "GL11.GL_POLYGON_MODE");
      class_(2881, "GL11.GL_POLYGON_SMOOTH");
      class_(2882, "GL11.GL_POLYGON_STIPPLE");
      class_(2883, "GL11.GL_EDGE_FLAG");
      class_(2884, "GL11.GL_CULL_FACE");
      class_(2885, "GL11.GL_CULL_FACE_MODE");
      class_(2886, "GL11.GL_FRONT_FACE");
      class_(2896, "GL11.GL_LIGHTING");
      class_(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
      class_(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
      class_(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
      class_(2900, "GL11.GL_SHADE_MODEL");
      class_(2901, "GL11.GL_COLOR_MATERIAL_FACE");
      class_(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
      class_(2903, "GL11.GL_COLOR_MATERIAL");
      class_(2912, "GL11.GL_FOG");
      class_(2913, "GL11.GL_FOG_INDEX");
      class_(2914, "GL11.GL_FOG_DENSITY");
      class_(2915, "GL11.GL_FOG_START");
      class_(2916, "GL11.GL_FOG_END");
      class_(2917, "GL11.GL_FOG_MODE");
      class_(2918, "GL11.GL_FOG_COLOR");
      class_(2928, "GL11.GL_DEPTH_RANGE");
      class_(2929, "GL11.GL_DEPTH_TEST");
      class_(2930, "GL11.GL_DEPTH_WRITEMASK");
      class_(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
      class_(2932, "GL11.GL_DEPTH_FUNC");
      class_(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
      class_(2960, "GL11.GL_STENCIL_TEST");
      class_(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
      class_(2962, "GL11.GL_STENCIL_FUNC");
      class_(2963, "GL11.GL_STENCIL_VALUE_MASK");
      class_(2964, "GL11.GL_STENCIL_FAIL");
      class_(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
      class_(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
      class_(2967, "GL11.GL_STENCIL_REF");
      class_(2968, "GL11.GL_STENCIL_WRITEMASK");
      class_(2976, "GL11.GL_MATRIX_MODE");
      class_(2977, "GL11.GL_NORMALIZE");
      class_(2978, "GL11.GL_VIEWPORT");
      class_(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
      class_(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
      class_(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
      class_(2982, "GL11.GL_MODELVIEW_MATRIX");
      class_(2983, "GL11.GL_PROJECTION_MATRIX");
      class_(2984, "GL11.GL_TEXTURE_MATRIX");
      class_(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
      class_(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
      class_(3008, "GL11.GL_ALPHA_TEST");
      class_(3009, "GL11.GL_ALPHA_TEST_FUNC");
      class_(3010, "GL11.GL_ALPHA_TEST_REF");
      class_(3024, "GL11.GL_DITHER");
      class_(3040, "GL11.GL_BLEND_DST");
      class_(3041, "GL11.GL_BLEND_SRC");
      class_(3042, "GL11.GL_BLEND");
      class_(3056, "GL11.GL_LOGIC_OP_MODE");
      class_(3057, "GL11.GL_INDEX_LOGIC_OP");
      class_(3058, "GL11.GL_COLOR_LOGIC_OP");
      class_(3072, "GL11.GL_AUX_BUFFERS");
      class_(3073, "GL11.GL_DRAW_BUFFER");
      class_(3074, "GL11.GL_READ_BUFFER");
      class_(3088, "GL11.GL_SCISSOR_BOX");
      class_(3089, "GL11.GL_SCISSOR_TEST");
      class_(3104, "GL11.GL_INDEX_CLEAR_VALUE");
      class_(3105, "GL11.GL_INDEX_WRITEMASK");
      class_(3106, "GL11.GL_COLOR_CLEAR_VALUE");
      class_(3107, "GL11.GL_COLOR_WRITEMASK");
      class_(3120, "GL11.GL_INDEX_MODE");
      class_(3121, "GL11.GL_RGBA_MODE");
      class_(3122, "GL11.GL_DOUBLEBUFFER");
      class_(3123, "GL11.GL_STEREO");
      class_(3136, "GL11.GL_RENDER_MODE");
      class_(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
      class_(3153, "GL11.GL_POINT_SMOOTH_HINT");
      class_(3154, "GL11.GL_LINE_SMOOTH_HINT");
      class_(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
      class_(3156, "GL11.GL_FOG_HINT");
      class_(3168, "GL11.GL_TEXTURE_GEN_S");
      class_(3169, "GL11.GL_TEXTURE_GEN_T");
      class_(3170, "GL11.GL_TEXTURE_GEN_R");
      class_(3171, "GL11.GL_TEXTURE_GEN_Q");
      class_(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
      class_(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
      class_(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
      class_(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
      class_(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
      class_(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
      class_(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
      class_(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
      class_(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
      class_(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
      class_(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
      class_(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
      class_(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
      class_(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
      class_(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
      class_(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
      class_(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
      class_(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
      class_(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
      class_(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
      class_(3312, "GL11.GL_UNPACK_SWAP_BYTES");
      class_(3313, "GL11.GL_UNPACK_LSB_FIRST");
      class_(3314, "GL11.GL_UNPACK_ROW_LENGTH");
      class_(3315, "GL11.GL_UNPACK_SKIP_ROWS");
      class_(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
      class_(3317, "GL11.GL_UNPACK_ALIGNMENT");
      class_(3328, "GL11.GL_PACK_SWAP_BYTES");
      class_(3329, "GL11.GL_PACK_LSB_FIRST");
      class_(3330, "GL11.GL_PACK_ROW_LENGTH");
      class_(3331, "GL11.GL_PACK_SKIP_ROWS");
      class_(3332, "GL11.GL_PACK_SKIP_PIXELS");
      class_(3333, "GL11.GL_PACK_ALIGNMENT");
      class_(3344, "GL11.GL_MAP_COLOR");
      class_(3345, "GL11.GL_MAP_STENCIL");
      class_(3346, "GL11.GL_INDEX_SHIFT");
      class_(3347, "GL11.GL_INDEX_OFFSET");
      class_(3348, "GL11.GL_RED_SCALE");
      class_(3349, "GL11.GL_RED_BIAS");
      class_(3350, "GL11.GL_ZOOM_X");
      class_(3351, "GL11.GL_ZOOM_Y");
      class_(3352, "GL11.GL_GREEN_SCALE");
      class_(3353, "GL11.GL_GREEN_BIAS");
      class_(3354, "GL11.GL_BLUE_SCALE");
      class_(3355, "GL11.GL_BLUE_BIAS");
      class_(3356, "GL11.GL_ALPHA_SCALE");
      class_(3357, "GL11.GL_ALPHA_BIAS");
      class_(3358, "GL11.GL_DEPTH_SCALE");
      class_(3359, "GL11.GL_DEPTH_BIAS");
      class_(3376, "GL11.GL_MAX_EVAL_ORDER");
      class_(3377, "GL11.GL_MAX_LIGHTS");
      class_(3378, "GL11.GL_MAX_CLIP_PLANES");
      class_(3379, "GL11.GL_MAX_TEXTURE_SIZE");
      class_(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
      class_(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
      class_(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
      class_(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
      class_(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
      class_(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
      class_(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
      class_(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
      class_(3408, "GL11.GL_SUBPIXEL_BITS");
      class_(3409, "GL11.GL_INDEX_BITS");
      class_(3410, "GL11.GL_RED_BITS");
      class_(3411, "GL11.GL_GREEN_BITS");
      class_(3412, "GL11.GL_BLUE_BITS");
      class_(3413, "GL11.GL_ALPHA_BITS");
      class_(3414, "GL11.GL_DEPTH_BITS");
      class_(3415, "GL11.GL_STENCIL_BITS");
      class_(3416, "GL11.GL_ACCUM_RED_BITS");
      class_(3417, "GL11.GL_ACCUM_GREEN_BITS");
      class_(3418, "GL11.GL_ACCUM_BLUE_BITS");
      class_(3419, "GL11.GL_ACCUM_ALPHA_BITS");
      class_(3440, "GL11.GL_NAME_STACK_DEPTH");
      class_(3456, "GL11.GL_AUTO_NORMAL");
      class_(3472, "GL11.GL_MAP1_COLOR_4");
      class_(3473, "GL11.GL_MAP1_INDEX");
      class_(3474, "GL11.GL_MAP1_NORMAL");
      class_(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
      class_(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
      class_(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
      class_(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
      class_(3479, "GL11.GL_MAP1_VERTEX_3");
      class_(3480, "GL11.GL_MAP1_VERTEX_4");
      class_(3504, "GL11.GL_MAP2_COLOR_4");
      class_(3505, "GL11.GL_MAP2_INDEX");
      class_(3506, "GL11.GL_MAP2_NORMAL");
      class_(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
      class_(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
      class_(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
      class_(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
      class_(3511, "GL11.GL_MAP2_VERTEX_3");
      class_(3512, "GL11.GL_MAP2_VERTEX_4");
      class_(3536, "GL11.GL_MAP1_GRID_DOMAIN");
      class_(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
      class_(3538, "GL11.GL_MAP2_GRID_DOMAIN");
      class_(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
      class_(3552, "GL11.GL_TEXTURE_1D");
      class_(3553, "GL11.GL_TEXTURE_2D");
      class_(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
      class_(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
      class_(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
      class_(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
      class_(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
      class_(4096, "GL11.GL_TEXTURE_WIDTH");
      class_(4097, "GL11.GL_TEXTURE_HEIGHT");
      class_(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
      class_(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
      class_(4101, "GL11.GL_TEXTURE_BORDER");
      class_(4352, "GL11.GL_DONT_CARE");
      class_(4353, "GL11.GL_FASTEST");
      class_(4354, "GL11.GL_NICEST");
      class_(16384, "GL11.GL_LIGHT0");
      class_(16385, "GL11.GL_LIGHT1");
      class_(16386, "GL11.GL_LIGHT2");
      class_(16387, "GL11.GL_LIGHT3");
      class_(16388, "GL11.GL_LIGHT4");
      class_(16389, "GL11.GL_LIGHT5");
      class_(16390, "GL11.GL_LIGHT6");
      class_(16391, "GL11.GL_LIGHT7");
      class_(4608, "GL11.GL_AMBIENT");
      class_(4609, "GL11.GL_DIFFUSE");
      class_(4610, "GL11.GL_SPECULAR");
      class_(4611, "GL11.GL_POSITION");
      class_(4612, "GL11.GL_SPOT_DIRECTION");
      class_(4613, "GL11.GL_SPOT_EXPONENT");
      class_(4614, "GL11.GL_SPOT_CUTOFF");
      class_(4615, "GL11.GL_CONSTANT_ATTENUATION");
      class_(4616, "GL11.GL_LINEAR_ATTENUATION");
      class_(4617, "GL11.GL_QUADRATIC_ATTENUATION");
      class_(4864, "GL11.GL_COMPILE");
      class_(4865, "GL11.GL_COMPILE_AND_EXECUTE");
      class_(5376, "GL11.GL_CLEAR");
      class_(5377, "GL11.GL_AND");
      class_(5378, "GL11.GL_AND_REVERSE");
      class_(5379, "GL11.GL_COPY");
      class_(5380, "GL11.GL_AND_INVERTED");
      class_(5381, "GL11.GL_NOOP");
      class_(5382, "GL11.GL_XOR");
      class_(5383, "GL11.GL_OR");
      class_(5384, "GL11.GL_NOR");
      class_(5385, "GL11.GL_EQUIV");
      class_(5386, "GL11.GL_INVERT");
      class_(5387, "GL11.GL_OR_REVERSE");
      class_(5388, "GL11.GL_COPY_INVERTED");
      class_(5389, "GL11.GL_OR_INVERTED");
      class_(5390, "GL11.GL_NAND");
      class_(5391, "GL11.GL_SET");
      class_(5632, "GL11.GL_EMISSION");
      class_(5633, "GL11.GL_SHININESS");
      class_(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
      class_(5635, "GL11.GL_COLOR_INDEXES");
      class_(5888, "GL11.GL_MODELVIEW");
      class_(5889, "GL11.GL_PROJECTION");
      class_(5890, "GL11.GL_TEXTURE");
      class_(6144, "GL11.GL_COLOR");
      class_(6145, "GL11.GL_DEPTH");
      class_(6146, "GL11.GL_STENCIL");
      class_(6400, "GL11.GL_COLOR_INDEX");
      class_(6401, "GL11.GL_STENCIL_INDEX");
      class_(6402, "GL11.GL_DEPTH_COMPONENT");
      class_(6403, "GL11.GL_RED");
      class_(6404, "GL11.GL_GREEN");
      class_(6405, "GL11.GL_BLUE");
      class_(6406, "GL11.GL_ALPHA");
      class_(6407, "GL11.GL_RGB");
      class_(6408, "GL11.GL_RGBA");
      class_(6409, "GL11.GL_LUMINANCE");
      class_(6410, "GL11.GL_LUMINANCE_ALPHA");
      class_(6656, "GL11.GL_BITMAP");
      class_(6912, "GL11.GL_POINT");
      class_(6913, "GL11.GL_LINE");
      class_(6914, "GL11.GL_FILL");
      class_(7168, "GL11.GL_RENDER");
      class_(7169, "GL11.GL_FEEDBACK");
      class_(7170, "GL11.GL_SELECT");
      class_(7424, "GL11.GL_FLAT");
      class_(7425, "GL11.GL_SMOOTH");
      class_(7680, "GL11.GL_KEEP");
      class_(7681, "GL11.GL_REPLACE");
      class_(7682, "GL11.GL_INCR");
      class_(7683, "GL11.GL_DECR");
      class_(7936, "GL11.GL_VENDOR");
      class_(7937, "GL11.GL_RENDERER");
      class_(7938, "GL11.GL_VERSION");
      class_(7939, "GL11.GL_EXTENSIONS");
      class_(8192, "GL11.GL_S");
      class_(8193, "GL11.GL_T");
      class_(8194, "GL11.GL_R");
      class_(8195, "GL11.GL_Q");
      class_(8448, "GL11.GL_MODULATE");
      class_(8449, "GL11.GL_DECAL");
      class_(8704, "GL11.GL_TEXTURE_ENV_MODE");
      class_(8705, "GL11.GL_TEXTURE_ENV_COLOR");
      class_(8960, "GL11.GL_TEXTURE_ENV");
      class_(9216, "GL11.GL_EYE_LINEAR");
      class_(9217, "GL11.GL_OBJECT_LINEAR");
      class_(9218, "GL11.GL_SPHERE_MAP");
      class_(9472, "GL11.GL_TEXTURE_GEN_MODE");
      class_(9473, "GL11.GL_OBJECT_PLANE");
      class_(9474, "GL11.GL_EYE_PLANE");
      class_(9728, "GL11.GL_NEAREST");
      class_(9729, "GL11.GL_LINEAR");
      class_(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
      class_(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
      class_(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
      class_(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
      class_(10240, "GL11.GL_TEXTURE_MAG_FILTER");
      class_(10241, "GL11.GL_TEXTURE_MIN_FILTER");
      class_(10242, "GL11.GL_TEXTURE_WRAP_S");
      class_(10243, "GL11.GL_TEXTURE_WRAP_T");
      class_(10496, "GL11.GL_CLAMP");
      class_(10497, "GL11.GL_REPEAT");
      class_(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
      class_(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
      class_(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
      class_(10753, "GL11.GL_POLYGON_OFFSET_POINT");
      class_(10754, "GL11.GL_POLYGON_OFFSET_LINE");
      class_(32823, "GL11.GL_POLYGON_OFFSET_FILL");
      class_(32827, "GL11.GL_ALPHA4");
      class_(32828, "GL11.GL_ALPHA8");
      class_(32829, "GL11.GL_ALPHA12");
      class_(32830, "GL11.GL_ALPHA16");
      class_(32831, "GL11.GL_LUMINANCE4");
      class_(32832, "GL11.GL_LUMINANCE8");
      class_(32833, "GL11.GL_LUMINANCE12");
      class_(32834, "GL11.GL_LUMINANCE16");
      class_(32835, "GL11.GL_LUMINANCE4_ALPHA4");
      class_(32836, "GL11.GL_LUMINANCE6_ALPHA2");
      class_(32837, "GL11.GL_LUMINANCE8_ALPHA8");
      class_(32838, "GL11.GL_LUMINANCE12_ALPHA4");
      class_(32839, "GL11.GL_LUMINANCE12_ALPHA12");
      class_(32840, "GL11.GL_LUMINANCE16_ALPHA16");
      class_(32841, "GL11.GL_INTENSITY");
      class_(32842, "GL11.GL_INTENSITY4");
      class_(32843, "GL11.GL_INTENSITY8");
      class_(32844, "GL11.GL_INTENSITY12");
      class_(32845, "GL11.GL_INTENSITY16");
      class_(10768, "GL11.GL_R3_G3_B2");
      class_(32847, "GL11.GL_RGB4");
      class_(32848, "GL11.GL_RGB5");
      class_(32849, "GL11.GL_RGB8");
      class_(32850, "GL11.GL_RGB10");
      class_(32851, "GL11.GL_RGB12");
      class_(32852, "GL11.GL_RGB16");
      class_(32853, "GL11.GL_RGBA2");
      class_(32854, "GL11.GL_RGBA4");
      class_(32855, "GL11.GL_RGB5_A1");
      class_(32856, "GL11.GL_RGBA8");
      class_(32857, "GL11.GL_RGB10_A2");
      class_(32858, "GL11.GL_RGBA12");
      class_(32859, "GL11.GL_RGBA16");
      class_(32860, "GL11.GL_TEXTURE_RED_SIZE");
      class_(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
      class_(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
      class_(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
      class_(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
      class_(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
      class_(32867, "GL11.GL_PROXY_TEXTURE_1D");
      class_(32868, "GL11.GL_PROXY_TEXTURE_2D");
      class_(32870, "GL11.GL_TEXTURE_PRIORITY");
      class_(32871, "GL11.GL_TEXTURE_RESIDENT");
      class_(32872, "GL11.GL_TEXTURE_BINDING_1D");
      class_(32873, "GL11.GL_TEXTURE_BINDING_2D");
      class_(32884, "GL11.GL_VERTEX_ARRAY");
      class_(32885, "GL11.GL_NORMAL_ARRAY");
      class_(32886, "GL11.GL_COLOR_ARRAY");
      class_(32887, "GL11.GL_INDEX_ARRAY");
      class_(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
      class_(32889, "GL11.GL_EDGE_FLAG_ARRAY");
      class_(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
      class_(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
      class_(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
      class_(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
      class_(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
      class_(32897, "GL11.GL_COLOR_ARRAY_SIZE");
      class_(32898, "GL11.GL_COLOR_ARRAY_TYPE");
      class_(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
      class_(32901, "GL11.GL_INDEX_ARRAY_TYPE");
      class_(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
      class_(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
      class_(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
      class_(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
      class_(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
      class_(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
      class_(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
      class_(32912, "GL11.GL_COLOR_ARRAY_POINTER");
      class_(32913, "GL11.GL_INDEX_ARRAY_POINTER");
      class_(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
      class_(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
      class_(10784, "GL11.GL_V2F");
      class_(10785, "GL11.GL_V3F");
      class_(10786, "GL11.GL_C4UB_V2F");
      class_(10787, "GL11.GL_C4UB_V3F");
      class_(10788, "GL11.GL_C3F_V3F");
      class_(10789, "GL11.GL_N3F_V3F");
      class_(10790, "GL11.GL_C4F_N3F_V3F");
      class_(10791, "GL11.GL_T2F_V3F");
      class_(10792, "GL11.GL_T4F_V4F");
      class_(10793, "GL11.GL_T2F_C4UB_V3F");
      class_(10794, "GL11.GL_T2F_C3F_V3F");
      class_(10795, "GL11.GL_T2F_N3F_V3F");
      class_(10796, "GL11.GL_T2F_C4F_N3F_V3F");
      class_(10797, "GL11.GL_T4F_C4F_N3F_V4F");
      class_(3057, "GL11.GL_LOGIC_OP");
      class_(4099, "GL11.GL_TEXTURE_COMPONENTS");
      class_(32874, "GL12.GL_TEXTURE_BINDING_3D");
      class_(32875, "GL12.GL_PACK_SKIP_IMAGES");
      class_(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
      class_(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
      class_(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
      class_(32879, "GL12.GL_TEXTURE_3D");
      class_(32880, "GL12.GL_PROXY_TEXTURE_3D");
      class_(32881, "GL12.GL_TEXTURE_DEPTH");
      class_(32882, "GL12.GL_TEXTURE_WRAP_R");
      class_(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
      class_(32992, "GL12.GL_BGR");
      class_(32993, "GL12.GL_BGRA");
      class_(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
      class_(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
      class_(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
      class_(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
      class_(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
      class_(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
      class_(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
      class_(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
      class_(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
      class_(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
      class_(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
      class_(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
      class_(32826, "GL12.GL_RESCALE_NORMAL");
      class_(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
      class_(33273, "GL12.GL_SINGLE_COLOR");
      class_(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
      class_(33071, "GL12.GL_CLAMP_TO_EDGE");
      class_(33082, "GL12.GL_TEXTURE_MIN_LOD");
      class_(33083, "GL12.GL_TEXTURE_MAX_LOD");
      class_(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
      class_(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
      class_(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
      class_(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
      class_(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
      class_(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
      class_(33984, "GL13.GL_TEXTURE0");
      class_(33985, "GL13.GL_TEXTURE1");
      class_(33986, "GL13.GL_TEXTURE2");
      class_(33987, "GL13.GL_TEXTURE3");
      class_(33988, "GL13.GL_TEXTURE4");
      class_(33989, "GL13.GL_TEXTURE5");
      class_(33990, "GL13.GL_TEXTURE6");
      class_(33991, "GL13.GL_TEXTURE7");
      class_(33992, "GL13.GL_TEXTURE8");
      class_(33993, "GL13.GL_TEXTURE9");
      class_(33994, "GL13.GL_TEXTURE10");
      class_(33995, "GL13.GL_TEXTURE11");
      class_(33996, "GL13.GL_TEXTURE12");
      class_(33997, "GL13.GL_TEXTURE13");
      class_(33998, "GL13.GL_TEXTURE14");
      class_(33999, "GL13.GL_TEXTURE15");
      class_(34000, "GL13.GL_TEXTURE16");
      class_(34001, "GL13.GL_TEXTURE17");
      class_(34002, "GL13.GL_TEXTURE18");
      class_(34003, "GL13.GL_TEXTURE19");
      class_(34004, "GL13.GL_TEXTURE20");
      class_(34005, "GL13.GL_TEXTURE21");
      class_(34006, "GL13.GL_TEXTURE22");
      class_(34007, "GL13.GL_TEXTURE23");
      class_(34008, "GL13.GL_TEXTURE24");
      class_(34009, "GL13.GL_TEXTURE25");
      class_(34010, "GL13.GL_TEXTURE26");
      class_(34011, "GL13.GL_TEXTURE27");
      class_(34012, "GL13.GL_TEXTURE28");
      class_(34013, "GL13.GL_TEXTURE29");
      class_(34014, "GL13.GL_TEXTURE30");
      class_(34015, "GL13.GL_TEXTURE31");
      class_(34016, "GL13.GL_ACTIVE_TEXTURE");
      class_(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
      class_(34018, "GL13.GL_MAX_TEXTURE_UNITS");
      class_(34065, "GL13.GL_NORMAL_MAP");
      class_(34066, "GL13.GL_REFLECTION_MAP");
      class_(34067, "GL13.GL_TEXTURE_CUBE_MAP");
      class_(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
      class_(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
      class_(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
      class_(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
      class_(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
      class_(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
      class_(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
      class_(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
      class_(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
      class_(34025, "GL13.GL_COMPRESSED_ALPHA");
      class_(34026, "GL13.GL_COMPRESSED_LUMINANCE");
      class_(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
      class_(34028, "GL13.GL_COMPRESSED_INTENSITY");
      class_(34029, "GL13.GL_COMPRESSED_RGB");
      class_(34030, "GL13.GL_COMPRESSED_RGBA");
      class_(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
      class_(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
      class_(34465, "GL13.GL_TEXTURE_COMPRESSED");
      class_(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
      class_(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
      class_(32925, "GL13.GL_MULTISAMPLE");
      class_(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
      class_(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
      class_(32928, "GL13.GL_SAMPLE_COVERAGE");
      class_(32936, "GL13.GL_SAMPLE_BUFFERS");
      class_(32937, "GL13.GL_SAMPLES");
      class_(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
      class_(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
      class_(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
      class_(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
      class_(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
      class_(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
      class_(34160, "GL13.GL_COMBINE");
      class_(34161, "GL13.GL_COMBINE_RGB");
      class_(34162, "GL13.GL_COMBINE_ALPHA");
      class_(34176, "GL13.GL_SOURCE0_RGB");
      class_(34177, "GL13.GL_SOURCE1_RGB");
      class_(34178, "GL13.GL_SOURCE2_RGB");
      class_(34184, "GL13.GL_SOURCE0_ALPHA");
      class_(34185, "GL13.GL_SOURCE1_ALPHA");
      class_(34186, "GL13.GL_SOURCE2_ALPHA");
      class_(34192, "GL13.GL_OPERAND0_RGB");
      class_(34193, "GL13.GL_OPERAND1_RGB");
      class_(34194, "GL13.GL_OPERAND2_RGB");
      class_(34200, "GL13.GL_OPERAND0_ALPHA");
      class_(34201, "GL13.GL_OPERAND1_ALPHA");
      class_(34202, "GL13.GL_OPERAND2_ALPHA");
      class_(34163, "GL13.GL_RGB_SCALE");
      class_(34164, "GL13.GL_ADD_SIGNED");
      class_(34165, "GL13.GL_INTERPOLATE");
      class_(34023, "GL13.GL_SUBTRACT");
      class_(34166, "GL13.GL_CONSTANT");
      class_(34167, "GL13.GL_PRIMARY_COLOR");
      class_(34168, "GL13.GL_PREVIOUS");
      class_(34478, "GL13.GL_DOT3_RGB");
      class_(34479, "GL13.GL_DOT3_RGBA");
      class_(33069, "GL13.GL_CLAMP_TO_BORDER");
      class_(33169, "GL14.GL_GENERATE_MIPMAP");
      class_(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
      class_(33189, "GL14.GL_DEPTH_COMPONENT16");
      class_(33190, "GL14.GL_DEPTH_COMPONENT24");
      class_(33191, "GL14.GL_DEPTH_COMPONENT32");
      class_(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
      class_(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
      class_(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
      class_(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
      class_(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
      class_(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
      class_(33873, "GL14.GL_FOG_COORDINATE");
      class_(33874, "GL14.GL_FRAGMENT_DEPTH");
      class_(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
      class_(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
      class_(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
      class_(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
      class_(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
      class_(33062, "GL14.GL_POINT_SIZE_MIN");
      class_(33063, "GL14.GL_POINT_SIZE_MAX");
      class_(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
      class_(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
      class_(33880, "GL14.GL_COLOR_SUM");
      class_(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
      class_(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
      class_(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
      class_(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
      class_(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
      class_(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
      class_(32968, "GL14.GL_BLEND_DST_RGB");
      class_(32969, "GL14.GL_BLEND_SRC_RGB");
      class_(32970, "GL14.GL_BLEND_DST_ALPHA");
      class_(32971, "GL14.GL_BLEND_SRC_ALPHA");
      class_(34055, "GL14.GL_INCR_WRAP");
      class_(34056, "GL14.GL_DECR_WRAP");
      class_(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
      class_(34049, "GL14.GL_TEXTURE_LOD_BIAS");
      class_(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
      class_(33648, "GL14.GL_MIRRORED_REPEAT");
      class_(32773, "ARBImaging.GL_BLEND_COLOR");
      class_(32777, "ARBImaging.GL_BLEND_EQUATION");
      class_(32774, "GL14.GL_FUNC_ADD");
      class_(32778, "GL14.GL_FUNC_SUBTRACT");
      class_(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
      class_(32775, "GL14.GL_MIN");
      class_(32776, "GL14.GL_MAX");
      class_(34962, "GL15.GL_ARRAY_BUFFER");
      class_(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
      class_(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
      class_(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
      class_(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
      class_(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
      class_(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
      class_(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
      class_(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
      class_(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
      class_(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
      class_(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
      class_(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
      class_(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
      class_(35040, "GL15.GL_STREAM_DRAW");
      class_(35041, "GL15.GL_STREAM_READ");
      class_(35042, "GL15.GL_STREAM_COPY");
      class_(35044, "GL15.GL_STATIC_DRAW");
      class_(35045, "GL15.GL_STATIC_READ");
      class_(35046, "GL15.GL_STATIC_COPY");
      class_(35048, "GL15.GL_DYNAMIC_DRAW");
      class_(35049, "GL15.GL_DYNAMIC_READ");
      class_(35050, "GL15.GL_DYNAMIC_COPY");
      class_(35000, "GL15.GL_READ_ONLY");
      class_(35001, "GL15.GL_WRITE_ONLY");
      class_(35002, "GL15.GL_READ_WRITE");
      class_(34660, "GL15.GL_BUFFER_SIZE");
      class_(34661, "GL15.GL_BUFFER_USAGE");
      class_(35003, "GL15.GL_BUFFER_ACCESS");
      class_(35004, "GL15.GL_BUFFER_MAPPED");
      class_(35005, "GL15.GL_BUFFER_MAP_POINTER");
      class_(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
      class_(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
      class_(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
   }

   public static void class_(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      if (var0 > 0) {
         GLCapabilities var2 = org.lwjgl.opengl.GL.getCapabilities();
         if (var2.GL_KHR_debug) {
            GL11.glEnable(37600);
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int var3 = 0; var3 < private_.size(); var3++) {
               boolean var4 = var3 < var0;
               KHRDebug.glDebugMessageControl(4352, 4352, private_.get(var3), (int[])null, var4);
            }

            KHRDebug.glDebugMessageCallback(GLX.make(GLDebugMessageCallback.create(HX::class_), gs_3::class_), 0L);
         } else if (var2.GL_ARB_debug_output) {
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int var5 = 0; var5 < implements_.size(); var5++) {
               boolean var6 = var5 < var0;
               ARBDebugOutput.glDebugMessageControlARB(4352, 4352, implements_.get(var5), (int[])null, var6);
            }

            ARBDebugOutput.glDebugMessageCallbackARB(GLX.make(GLDebugMessageARBCallback.create(HX::class_), gs_3::class_), 0L);
         }
      }
   }

   private static void class_(int var0, int var1, int var2, int var3, int var4, long var5, long var7) {
      if (var1 != 33385 && var1 != 33386 && !rrki_1.class_(extends_, var2) && (!rrbb_3.rs() || var0 != 33352)) {
         QY var9 = QY.instanceof_();
         if ((var9 == null || var9.else_() == null || !var9.else_().goto_()) && rrbo_3.class_(var2)) {
            String var10 = break_(var0);
            String var11 = byte_(var1);
            String var12 = protected_(var3);
            String var13 = GLDebugMessageCallback.getMessage(var4, var5);
            var13 = rrzX_2.private_(var13, " \n\r\t");
            String var14 = String.format("OpenGL %s %s: %s (%s)", var10, var11, var2, var13);
            Exception var15 = new Exception("Stack trace");
            StackTraceElement[] var16 = var15.getStackTrace();
            StackTraceElement[] var17 = var16.length > 2 ? Arrays.copyOfRange(var16, 2, var16.length) : var16;
            var15.setStackTrace(var17);
            if (var1 == 33356) {
               protected_.error(var14, var15);
            } else {
               protected_.info(var14, var15);
            }

            if (rrbb_3.rT() && rrzQ_2.class_("ShowGlErrorDebug", 10000L)) {
               String var18 = rrbb_3.byte_(var2);
               if (var2 == 0 || rrbb_3.class_((Object)var18, (Object)"Unknown")) {
                  var18 = var13;
               }

               String var19 = jI_2.class_("of.message.openglError", var2, var18);
               ((cq_3)QY.instanceof_().class_[19]).throws_().class_(new rgN_2(var19));
            }
         }
      }
   }

   private static int[] class_() {
      String var0 = System.getProperty("gl.ignore.errors");
      if (var0 == null) {
         return new int[0];
      } else {
         String[] var1 = rrbb_3.class_(var0, ",");
         int[] var2 = new int[0];

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3].trim();
            int var5 = var4.startsWith("0x") ? rrbb_3.break_(var4, -1) : rrbb_3.class_(var4, -1);
            if (var5 < 0) {
               rrbb_3.protected_("Invalid error id: " + var4);
            } else {
               rrbb_3.case_("Ignore OpenGL error: " + var5);
               var2 = rrki_1.break_(var2, var5);
            }
         }

         return var2;
      }
   }

   private static String class_(int var0) {
      return "Unknown (0x" + Integer.toHexString(var0).toUpperCase() + ")";
   }

   private static void class_(int var0, String var1) {
      catch_.merge(var0, var1, (var0x, var1x) -> var0x + "/" + var1x);
   }

   private static String break_(int var0) {
      switch (var0) {
         case 33350:
            return "API";
         case 33351:
            return "WINDOW SYSTEM";
         case 33352:
            return "SHADER COMPILER";
         case 33353:
            return "THIRD PARTY";
         case 33354:
            return "APPLICATION";
         case 33355:
            return "OTHER";
         default:
            return class_(var0);
      }
   }

   private static String protected_(int var0) {
      switch (var0) {
         case 33387:
            return "NOTIFICATION";
         case 37190:
            return "HIGH";
         case 37191:
            return "MEDIUM";
         case 37192:
            return "LOW";
         default:
            return class_(var0);
      }
   }
}
