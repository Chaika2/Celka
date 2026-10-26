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
   private static final Logger id_protected = LogManager.getLogger();
   protected static final ByteBuffer id_class = Hb_1.id_class(64);
   protected static final FloatBuffer id_break = id_class.asFloatBuffer();
   protected static final IntBuffer id_byte = id_class.asIntBuffer();
   private static final Joiner id_throws = Joiner.on('\n');
   private static final Joiner id_case = Joiner.on("; ");
   private static final Map<Integer, String> id_catch = Maps.newHashMap();
   private static final List<Integer> id_private = ImmutableList.of(37190, 37191, 37192, 33387);
   private static final List<Integer> id_implements = ImmutableList.of(37190, 37191, 37192);
   private static final Map<String, List<String>> id_finally = Maps.newHashMap();
   private static final int[] id_extends = id_class();

   private static String id_byte(int var0) {
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
            return id_class(var0);
      }
   }

   static {
      id_class(256, "GL11.GL_ACCUM");
      id_class(257, "GL11.GL_LOAD");
      id_class(258, "GL11.GL_RETURN");
      id_class(259, "GL11.GL_MULT");
      id_class(260, "GL11.GL_ADD");
      id_class(512, "GL11.GL_NEVER");
      id_class(513, "GL11.GL_LESS");
      id_class(514, "GL11.GL_EQUAL");
      id_class(515, "GL11.GL_LEQUAL");
      id_class(516, "GL11.GL_GREATER");
      id_class(517, "GL11.GL_NOTEQUAL");
      id_class(518, "GL11.GL_GEQUAL");
      id_class(519, "GL11.GL_ALWAYS");
      id_class(0, "GL11.GL_POINTS");
      id_class(1, "GL11.GL_LINES");
      id_class(2, "GL11.GL_LINE_LOOP");
      id_class(3, "GL11.GL_LINE_STRIP");
      id_class(4, "GL11.GL_TRIANGLES");
      id_class(5, "GL11.GL_TRIANGLE_STRIP");
      id_class(6, "GL11.GL_TRIANGLE_FAN");
      id_class(7, "GL11.GL_QUADS");
      id_class(8, "GL11.GL_QUAD_STRIP");
      id_class(9, "GL11.GL_POLYGON");
      id_class(0, "GL11.GL_ZERO");
      id_class(1, "GL11.GL_ONE");
      id_class(768, "GL11.GL_SRC_COLOR");
      id_class(769, "GL11.GL_ONE_MINUS_SRC_COLOR");
      id_class(770, "GL11.GL_SRC_ALPHA");
      id_class(771, "GL11.GL_ONE_MINUS_SRC_ALPHA");
      id_class(772, "GL11.GL_DST_ALPHA");
      id_class(773, "GL11.GL_ONE_MINUS_DST_ALPHA");
      id_class(774, "GL11.GL_DST_COLOR");
      id_class(775, "GL11.GL_ONE_MINUS_DST_COLOR");
      id_class(776, "GL11.GL_SRC_ALPHA_SATURATE");
      id_class(32769, "GL14.GL_CONSTANT_COLOR");
      id_class(32770, "GL14.GL_ONE_MINUS_CONSTANT_COLOR");
      id_class(32771, "GL14.GL_CONSTANT_ALPHA");
      id_class(32772, "GL14.GL_ONE_MINUS_CONSTANT_ALPHA");
      id_class(1, "GL11.GL_TRUE");
      id_class(0, "GL11.GL_FALSE");
      id_class(12288, "GL11.GL_CLIP_PLANE0");
      id_class(12289, "GL11.GL_CLIP_PLANE1");
      id_class(12290, "GL11.GL_CLIP_PLANE2");
      id_class(12291, "GL11.GL_CLIP_PLANE3");
      id_class(12292, "GL11.GL_CLIP_PLANE4");
      id_class(12293, "GL11.GL_CLIP_PLANE5");
      id_class(5120, "GL11.GL_BYTE");
      id_class(5121, "GL11.GL_UNSIGNED_BYTE");
      id_class(5122, "GL11.GL_SHORT");
      id_class(5123, "GL11.GL_UNSIGNED_SHORT");
      id_class(5124, "GL11.GL_INT");
      id_class(5125, "GL11.GL_UNSIGNED_INT");
      id_class(5126, "GL11.GL_FLOAT");
      id_class(5127, "GL11.GL_2_BYTES");
      id_class(5128, "GL11.GL_3_BYTES");
      id_class(5129, "GL11.GL_4_BYTES");
      id_class(5130, "GL11.GL_DOUBLE");
      id_class(0, "GL11.GL_NONE");
      id_class(1024, "GL11.GL_FRONT_LEFT");
      id_class(1025, "GL11.GL_FRONT_RIGHT");
      id_class(1026, "GL11.GL_BACK_LEFT");
      id_class(1027, "GL11.GL_BACK_RIGHT");
      id_class(1028, "GL11.GL_FRONT");
      id_class(1029, "GL11.GL_BACK");
      id_class(1030, "GL11.GL_LEFT");
      id_class(1031, "GL11.GL_RIGHT");
      id_class(1032, "GL11.GL_FRONT_AND_BACK");
      id_class(1033, "GL11.GL_AUX0");
      id_class(1034, "GL11.GL_AUX1");
      id_class(1035, "GL11.GL_AUX2");
      id_class(1036, "GL11.GL_AUX3");
      id_class(0, "GL11.GL_NO_ERROR");
      id_class(1280, "GL11.GL_INVALID_ENUM");
      id_class(1281, "GL11.GL_INVALID_VALUE");
      id_class(1282, "GL11.GL_INVALID_OPERATION");
      id_class(1283, "GL11.GL_STACK_OVERFLOW");
      id_class(1284, "GL11.GL_STACK_UNDERFLOW");
      id_class(1285, "GL11.GL_OUT_OF_MEMORY");
      id_class(1536, "GL11.GL_2D");
      id_class(1537, "GL11.GL_3D");
      id_class(1538, "GL11.GL_3D_COLOR");
      id_class(1539, "GL11.GL_3D_COLOR_TEXTURE");
      id_class(1540, "GL11.GL_4D_COLOR_TEXTURE");
      id_class(1792, "GL11.GL_PASS_THROUGH_TOKEN");
      id_class(1793, "GL11.GL_POINT_TOKEN");
      id_class(1794, "GL11.GL_LINE_TOKEN");
      id_class(1795, "GL11.GL_POLYGON_TOKEN");
      id_class(1796, "GL11.GL_BITMAP_TOKEN");
      id_class(1797, "GL11.GL_DRAW_PIXEL_TOKEN");
      id_class(1798, "GL11.GL_COPY_PIXEL_TOKEN");
      id_class(1799, "GL11.GL_LINE_RESET_TOKEN");
      id_class(2048, "GL11.GL_EXP");
      id_class(2049, "GL11.GL_EXP2");
      id_class(2304, "GL11.GL_CW");
      id_class(2305, "GL11.GL_CCW");
      id_class(2560, "GL11.GL_COEFF");
      id_class(2561, "GL11.GL_ORDER");
      id_class(2562, "GL11.GL_DOMAIN");
      id_class(2816, "GL11.GL_CURRENT_COLOR");
      id_class(2817, "GL11.GL_CURRENT_INDEX");
      id_class(2818, "GL11.GL_CURRENT_NORMAL");
      id_class(2819, "GL11.GL_CURRENT_TEXTURE_COORDS");
      id_class(2820, "GL11.GL_CURRENT_RASTER_COLOR");
      id_class(2821, "GL11.GL_CURRENT_RASTER_INDEX");
      id_class(2822, "GL11.GL_CURRENT_RASTER_TEXTURE_COORDS");
      id_class(2823, "GL11.GL_CURRENT_RASTER_POSITION");
      id_class(2824, "GL11.GL_CURRENT_RASTER_POSITION_VALID");
      id_class(2825, "GL11.GL_CURRENT_RASTER_DISTANCE");
      id_class(2832, "GL11.GL_POINT_SMOOTH");
      id_class(2833, "GL11.GL_POINT_SIZE");
      id_class(2834, "GL11.GL_POINT_SIZE_RANGE");
      id_class(2835, "GL11.GL_POINT_SIZE_GRANULARITY");
      id_class(2848, "GL11.GL_LINE_SMOOTH");
      id_class(2849, "GL11.GL_LINE_WIDTH");
      id_class(2850, "GL11.GL_LINE_WIDTH_RANGE");
      id_class(2851, "GL11.GL_LINE_WIDTH_GRANULARITY");
      id_class(2852, "GL11.GL_LINE_STIPPLE");
      id_class(2853, "GL11.GL_LINE_STIPPLE_PATTERN");
      id_class(2854, "GL11.GL_LINE_STIPPLE_REPEAT");
      id_class(2864, "GL11.GL_LIST_MODE");
      id_class(2865, "GL11.GL_MAX_LIST_NESTING");
      id_class(2866, "GL11.GL_LIST_BASE");
      id_class(2867, "GL11.GL_LIST_INDEX");
      id_class(2880, "GL11.GL_POLYGON_MODE");
      id_class(2881, "GL11.GL_POLYGON_SMOOTH");
      id_class(2882, "GL11.GL_POLYGON_STIPPLE");
      id_class(2883, "GL11.GL_EDGE_FLAG");
      id_class(2884, "GL11.GL_CULL_FACE");
      id_class(2885, "GL11.GL_CULL_FACE_MODE");
      id_class(2886, "GL11.GL_FRONT_FACE");
      id_class(2896, "GL11.GL_LIGHTING");
      id_class(2897, "GL11.GL_LIGHT_MODEL_LOCAL_VIEWER");
      id_class(2898, "GL11.GL_LIGHT_MODEL_TWO_SIDE");
      id_class(2899, "GL11.GL_LIGHT_MODEL_AMBIENT");
      id_class(2900, "GL11.GL_SHADE_MODEL");
      id_class(2901, "GL11.GL_COLOR_MATERIAL_FACE");
      id_class(2902, "GL11.GL_COLOR_MATERIAL_PARAMETER");
      id_class(2903, "GL11.GL_COLOR_MATERIAL");
      id_class(2912, "GL11.GL_FOG");
      id_class(2913, "GL11.GL_FOG_INDEX");
      id_class(2914, "GL11.GL_FOG_DENSITY");
      id_class(2915, "GL11.GL_FOG_START");
      id_class(2916, "GL11.GL_FOG_END");
      id_class(2917, "GL11.GL_FOG_MODE");
      id_class(2918, "GL11.GL_FOG_COLOR");
      id_class(2928, "GL11.GL_DEPTH_RANGE");
      id_class(2929, "GL11.GL_DEPTH_TEST");
      id_class(2930, "GL11.GL_DEPTH_WRITEMASK");
      id_class(2931, "GL11.GL_DEPTH_CLEAR_VALUE");
      id_class(2932, "GL11.GL_DEPTH_FUNC");
      id_class(2944, "GL11.GL_ACCUM_CLEAR_VALUE");
      id_class(2960, "GL11.GL_STENCIL_TEST");
      id_class(2961, "GL11.GL_STENCIL_CLEAR_VALUE");
      id_class(2962, "GL11.GL_STENCIL_FUNC");
      id_class(2963, "GL11.GL_STENCIL_VALUE_MASK");
      id_class(2964, "GL11.GL_STENCIL_FAIL");
      id_class(2965, "GL11.GL_STENCIL_PASS_DEPTH_FAIL");
      id_class(2966, "GL11.GL_STENCIL_PASS_DEPTH_PASS");
      id_class(2967, "GL11.GL_STENCIL_REF");
      id_class(2968, "GL11.GL_STENCIL_WRITEMASK");
      id_class(2976, "GL11.GL_MATRIX_MODE");
      id_class(2977, "GL11.GL_NORMALIZE");
      id_class(2978, "GL11.GL_VIEWPORT");
      id_class(2979, "GL11.GL_MODELVIEW_STACK_DEPTH");
      id_class(2980, "GL11.GL_PROJECTION_STACK_DEPTH");
      id_class(2981, "GL11.GL_TEXTURE_STACK_DEPTH");
      id_class(2982, "GL11.GL_MODELVIEW_MATRIX");
      id_class(2983, "GL11.GL_PROJECTION_MATRIX");
      id_class(2984, "GL11.GL_TEXTURE_MATRIX");
      id_class(2992, "GL11.GL_ATTRIB_STACK_DEPTH");
      id_class(2993, "GL11.GL_CLIENT_ATTRIB_STACK_DEPTH");
      id_class(3008, "GL11.GL_ALPHA_TEST");
      id_class(3009, "GL11.GL_ALPHA_TEST_FUNC");
      id_class(3010, "GL11.GL_ALPHA_TEST_REF");
      id_class(3024, "GL11.GL_DITHER");
      id_class(3040, "GL11.GL_BLEND_DST");
      id_class(3041, "GL11.GL_BLEND_SRC");
      id_class(3042, "GL11.GL_BLEND");
      id_class(3056, "GL11.GL_LOGIC_OP_MODE");
      id_class(3057, "GL11.GL_INDEX_LOGIC_OP");
      id_class(3058, "GL11.GL_COLOR_LOGIC_OP");
      id_class(3072, "GL11.GL_AUX_BUFFERS");
      id_class(3073, "GL11.GL_DRAW_BUFFER");
      id_class(3074, "GL11.GL_READ_BUFFER");
      id_class(3088, "GL11.GL_SCISSOR_BOX");
      id_class(3089, "GL11.GL_SCISSOR_TEST");
      id_class(3104, "GL11.GL_INDEX_CLEAR_VALUE");
      id_class(3105, "GL11.GL_INDEX_WRITEMASK");
      id_class(3106, "GL11.GL_COLOR_CLEAR_VALUE");
      id_class(3107, "GL11.GL_COLOR_WRITEMASK");
      id_class(3120, "GL11.GL_INDEX_MODE");
      id_class(3121, "GL11.GL_RGBA_MODE");
      id_class(3122, "GL11.GL_DOUBLEBUFFER");
      id_class(3123, "GL11.GL_STEREO");
      id_class(3136, "GL11.GL_RENDER_MODE");
      id_class(3152, "GL11.GL_PERSPECTIVE_CORRECTION_HINT");
      id_class(3153, "GL11.GL_POINT_SMOOTH_HINT");
      id_class(3154, "GL11.GL_LINE_SMOOTH_HINT");
      id_class(3155, "GL11.GL_POLYGON_SMOOTH_HINT");
      id_class(3156, "GL11.GL_FOG_HINT");
      id_class(3168, "GL11.GL_TEXTURE_GEN_S");
      id_class(3169, "GL11.GL_TEXTURE_GEN_T");
      id_class(3170, "GL11.GL_TEXTURE_GEN_R");
      id_class(3171, "GL11.GL_TEXTURE_GEN_Q");
      id_class(3184, "GL11.GL_PIXEL_MAP_I_TO_I");
      id_class(3185, "GL11.GL_PIXEL_MAP_S_TO_S");
      id_class(3186, "GL11.GL_PIXEL_MAP_I_TO_R");
      id_class(3187, "GL11.GL_PIXEL_MAP_I_TO_G");
      id_class(3188, "GL11.GL_PIXEL_MAP_I_TO_B");
      id_class(3189, "GL11.GL_PIXEL_MAP_I_TO_A");
      id_class(3190, "GL11.GL_PIXEL_MAP_R_TO_R");
      id_class(3191, "GL11.GL_PIXEL_MAP_G_TO_G");
      id_class(3192, "GL11.GL_PIXEL_MAP_B_TO_B");
      id_class(3193, "GL11.GL_PIXEL_MAP_A_TO_A");
      id_class(3248, "GL11.GL_PIXEL_MAP_I_TO_I_SIZE");
      id_class(3249, "GL11.GL_PIXEL_MAP_S_TO_S_SIZE");
      id_class(3250, "GL11.GL_PIXEL_MAP_I_TO_R_SIZE");
      id_class(3251, "GL11.GL_PIXEL_MAP_I_TO_G_SIZE");
      id_class(3252, "GL11.GL_PIXEL_MAP_I_TO_B_SIZE");
      id_class(3253, "GL11.GL_PIXEL_MAP_I_TO_A_SIZE");
      id_class(3254, "GL11.GL_PIXEL_MAP_R_TO_R_SIZE");
      id_class(3255, "GL11.GL_PIXEL_MAP_G_TO_G_SIZE");
      id_class(3256, "GL11.GL_PIXEL_MAP_B_TO_B_SIZE");
      id_class(3257, "GL11.GL_PIXEL_MAP_A_TO_A_SIZE");
      id_class(3312, "GL11.GL_UNPACK_SWAP_BYTES");
      id_class(3313, "GL11.GL_UNPACK_LSB_FIRST");
      id_class(3314, "GL11.GL_UNPACK_ROW_LENGTH");
      id_class(3315, "GL11.GL_UNPACK_SKIP_ROWS");
      id_class(3316, "GL11.GL_UNPACK_SKIP_PIXELS");
      id_class(3317, "GL11.GL_UNPACK_ALIGNMENT");
      id_class(3328, "GL11.GL_PACK_SWAP_BYTES");
      id_class(3329, "GL11.GL_PACK_LSB_FIRST");
      id_class(3330, "GL11.GL_PACK_ROW_LENGTH");
      id_class(3331, "GL11.GL_PACK_SKIP_ROWS");
      id_class(3332, "GL11.GL_PACK_SKIP_PIXELS");
      id_class(3333, "GL11.GL_PACK_ALIGNMENT");
      id_class(3344, "GL11.GL_MAP_COLOR");
      id_class(3345, "GL11.GL_MAP_STENCIL");
      id_class(3346, "GL11.GL_INDEX_SHIFT");
      id_class(3347, "GL11.GL_INDEX_OFFSET");
      id_class(3348, "GL11.GL_RED_SCALE");
      id_class(3349, "GL11.GL_RED_BIAS");
      id_class(3350, "GL11.GL_ZOOM_X");
      id_class(3351, "GL11.GL_ZOOM_Y");
      id_class(3352, "GL11.GL_GREEN_SCALE");
      id_class(3353, "GL11.GL_GREEN_BIAS");
      id_class(3354, "GL11.GL_BLUE_SCALE");
      id_class(3355, "GL11.GL_BLUE_BIAS");
      id_class(3356, "GL11.GL_ALPHA_SCALE");
      id_class(3357, "GL11.GL_ALPHA_BIAS");
      id_class(3358, "GL11.GL_DEPTH_SCALE");
      id_class(3359, "GL11.GL_DEPTH_BIAS");
      id_class(3376, "GL11.GL_MAX_EVAL_ORDER");
      id_class(3377, "GL11.GL_MAX_LIGHTS");
      id_class(3378, "GL11.GL_MAX_CLIP_PLANES");
      id_class(3379, "GL11.GL_MAX_TEXTURE_SIZE");
      id_class(3380, "GL11.GL_MAX_PIXEL_MAP_TABLE");
      id_class(3381, "GL11.GL_MAX_ATTRIB_STACK_DEPTH");
      id_class(3382, "GL11.GL_MAX_MODELVIEW_STACK_DEPTH");
      id_class(3383, "GL11.GL_MAX_NAME_STACK_DEPTH");
      id_class(3384, "GL11.GL_MAX_PROJECTION_STACK_DEPTH");
      id_class(3385, "GL11.GL_MAX_TEXTURE_STACK_DEPTH");
      id_class(3386, "GL11.GL_MAX_VIEWPORT_DIMS");
      id_class(3387, "GL11.GL_MAX_CLIENT_ATTRIB_STACK_DEPTH");
      id_class(3408, "GL11.GL_SUBPIXEL_BITS");
      id_class(3409, "GL11.GL_INDEX_BITS");
      id_class(3410, "GL11.GL_RED_BITS");
      id_class(3411, "GL11.GL_GREEN_BITS");
      id_class(3412, "GL11.GL_BLUE_BITS");
      id_class(3413, "GL11.GL_ALPHA_BITS");
      id_class(3414, "GL11.GL_DEPTH_BITS");
      id_class(3415, "GL11.GL_STENCIL_BITS");
      id_class(3416, "GL11.GL_ACCUM_RED_BITS");
      id_class(3417, "GL11.GL_ACCUM_GREEN_BITS");
      id_class(3418, "GL11.GL_ACCUM_BLUE_BITS");
      id_class(3419, "GL11.GL_ACCUM_ALPHA_BITS");
      id_class(3440, "GL11.GL_NAME_STACK_DEPTH");
      id_class(3456, "GL11.GL_AUTO_NORMAL");
      id_class(3472, "GL11.GL_MAP1_COLOR_4");
      id_class(3473, "GL11.GL_MAP1_INDEX");
      id_class(3474, "GL11.GL_MAP1_NORMAL");
      id_class(3475, "GL11.GL_MAP1_TEXTURE_COORD_1");
      id_class(3476, "GL11.GL_MAP1_TEXTURE_COORD_2");
      id_class(3477, "GL11.GL_MAP1_TEXTURE_COORD_3");
      id_class(3478, "GL11.GL_MAP1_TEXTURE_COORD_4");
      id_class(3479, "GL11.GL_MAP1_VERTEX_3");
      id_class(3480, "GL11.GL_MAP1_VERTEX_4");
      id_class(3504, "GL11.GL_MAP2_COLOR_4");
      id_class(3505, "GL11.GL_MAP2_INDEX");
      id_class(3506, "GL11.GL_MAP2_NORMAL");
      id_class(3507, "GL11.GL_MAP2_TEXTURE_COORD_1");
      id_class(3508, "GL11.GL_MAP2_TEXTURE_COORD_2");
      id_class(3509, "GL11.GL_MAP2_TEXTURE_COORD_3");
      id_class(3510, "GL11.GL_MAP2_TEXTURE_COORD_4");
      id_class(3511, "GL11.GL_MAP2_VERTEX_3");
      id_class(3512, "GL11.GL_MAP2_VERTEX_4");
      id_class(3536, "GL11.GL_MAP1_GRID_DOMAIN");
      id_class(3537, "GL11.GL_MAP1_GRID_SEGMENTS");
      id_class(3538, "GL11.GL_MAP2_GRID_DOMAIN");
      id_class(3539, "GL11.GL_MAP2_GRID_SEGMENTS");
      id_class(3552, "GL11.GL_TEXTURE_1D");
      id_class(3553, "GL11.GL_TEXTURE_2D");
      id_class(3568, "GL11.GL_FEEDBACK_BUFFER_POINTER");
      id_class(3569, "GL11.GL_FEEDBACK_BUFFER_SIZE");
      id_class(3570, "GL11.GL_FEEDBACK_BUFFER_TYPE");
      id_class(3571, "GL11.GL_SELECTION_BUFFER_POINTER");
      id_class(3572, "GL11.GL_SELECTION_BUFFER_SIZE");
      id_class(4096, "GL11.GL_TEXTURE_WIDTH");
      id_class(4097, "GL11.GL_TEXTURE_HEIGHT");
      id_class(4099, "GL11.GL_TEXTURE_INTERNAL_FORMAT");
      id_class(4100, "GL11.GL_TEXTURE_BORDER_COLOR");
      id_class(4101, "GL11.GL_TEXTURE_BORDER");
      id_class(4352, "GL11.GL_DONT_CARE");
      id_class(4353, "GL11.GL_FASTEST");
      id_class(4354, "GL11.GL_NICEST");
      id_class(16384, "GL11.GL_LIGHT0");
      id_class(16385, "GL11.GL_LIGHT1");
      id_class(16386, "GL11.GL_LIGHT2");
      id_class(16387, "GL11.GL_LIGHT3");
      id_class(16388, "GL11.GL_LIGHT4");
      id_class(16389, "GL11.GL_LIGHT5");
      id_class(16390, "GL11.GL_LIGHT6");
      id_class(16391, "GL11.GL_LIGHT7");
      id_class(4608, "GL11.GL_AMBIENT");
      id_class(4609, "GL11.GL_DIFFUSE");
      id_class(4610, "GL11.GL_SPECULAR");
      id_class(4611, "GL11.GL_POSITION");
      id_class(4612, "GL11.GL_SPOT_DIRECTION");
      id_class(4613, "GL11.GL_SPOT_EXPONENT");
      id_class(4614, "GL11.GL_SPOT_CUTOFF");
      id_class(4615, "GL11.GL_CONSTANT_ATTENUATION");
      id_class(4616, "GL11.GL_LINEAR_ATTENUATION");
      id_class(4617, "GL11.GL_QUADRATIC_ATTENUATION");
      id_class(4864, "GL11.GL_COMPILE");
      id_class(4865, "GL11.GL_COMPILE_AND_EXECUTE");
      id_class(5376, "GL11.GL_CLEAR");
      id_class(5377, "GL11.GL_AND");
      id_class(5378, "GL11.GL_AND_REVERSE");
      id_class(5379, "GL11.GL_COPY");
      id_class(5380, "GL11.GL_AND_INVERTED");
      id_class(5381, "GL11.GL_NOOP");
      id_class(5382, "GL11.GL_XOR");
      id_class(5383, "GL11.GL_OR");
      id_class(5384, "GL11.GL_NOR");
      id_class(5385, "GL11.GL_EQUIV");
      id_class(5386, "GL11.GL_INVERT");
      id_class(5387, "GL11.GL_OR_REVERSE");
      id_class(5388, "GL11.GL_COPY_INVERTED");
      id_class(5389, "GL11.GL_OR_INVERTED");
      id_class(5390, "GL11.GL_NAND");
      id_class(5391, "GL11.GL_SET");
      id_class(5632, "GL11.GL_EMISSION");
      id_class(5633, "GL11.GL_SHININESS");
      id_class(5634, "GL11.GL_AMBIENT_AND_DIFFUSE");
      id_class(5635, "GL11.GL_COLOR_INDEXES");
      id_class(5888, "GL11.GL_MODELVIEW");
      id_class(5889, "GL11.GL_PROJECTION");
      id_class(5890, "GL11.GL_TEXTURE");
      id_class(6144, "GL11.GL_COLOR");
      id_class(6145, "GL11.GL_DEPTH");
      id_class(6146, "GL11.GL_STENCIL");
      id_class(6400, "GL11.GL_COLOR_INDEX");
      id_class(6401, "GL11.GL_STENCIL_INDEX");
      id_class(6402, "GL11.GL_DEPTH_COMPONENT");
      id_class(6403, "GL11.GL_RED");
      id_class(6404, "GL11.GL_GREEN");
      id_class(6405, "GL11.GL_BLUE");
      id_class(6406, "GL11.GL_ALPHA");
      id_class(6407, "GL11.GL_RGB");
      id_class(6408, "GL11.GL_RGBA");
      id_class(6409, "GL11.GL_LUMINANCE");
      id_class(6410, "GL11.GL_LUMINANCE_ALPHA");
      id_class(6656, "GL11.GL_BITMAP");
      id_class(6912, "GL11.GL_POINT");
      id_class(6913, "GL11.GL_LINE");
      id_class(6914, "GL11.GL_FILL");
      id_class(7168, "GL11.GL_RENDER");
      id_class(7169, "GL11.GL_FEEDBACK");
      id_class(7170, "GL11.GL_SELECT");
      id_class(7424, "GL11.GL_FLAT");
      id_class(7425, "GL11.GL_SMOOTH");
      id_class(7680, "GL11.GL_KEEP");
      id_class(7681, "GL11.GL_REPLACE");
      id_class(7682, "GL11.GL_INCR");
      id_class(7683, "GL11.GL_DECR");
      id_class(7936, "GL11.GL_VENDOR");
      id_class(7937, "GL11.GL_RENDERER");
      id_class(7938, "GL11.GL_VERSION");
      id_class(7939, "GL11.GL_EXTENSIONS");
      id_class(8192, "GL11.GL_S");
      id_class(8193, "GL11.GL_T");
      id_class(8194, "GL11.GL_R");
      id_class(8195, "GL11.GL_Q");
      id_class(8448, "GL11.GL_MODULATE");
      id_class(8449, "GL11.GL_DECAL");
      id_class(8704, "GL11.GL_TEXTURE_ENV_MODE");
      id_class(8705, "GL11.GL_TEXTURE_ENV_COLOR");
      id_class(8960, "GL11.GL_TEXTURE_ENV");
      id_class(9216, "GL11.GL_EYE_LINEAR");
      id_class(9217, "GL11.GL_OBJECT_LINEAR");
      id_class(9218, "GL11.GL_SPHERE_MAP");
      id_class(9472, "GL11.GL_TEXTURE_GEN_MODE");
      id_class(9473, "GL11.GL_OBJECT_PLANE");
      id_class(9474, "GL11.GL_EYE_PLANE");
      id_class(9728, "GL11.GL_NEAREST");
      id_class(9729, "GL11.GL_LINEAR");
      id_class(9984, "GL11.GL_NEAREST_MIPMAP_NEAREST");
      id_class(9985, "GL11.GL_LINEAR_MIPMAP_NEAREST");
      id_class(9986, "GL11.GL_NEAREST_MIPMAP_LINEAR");
      id_class(9987, "GL11.GL_LINEAR_MIPMAP_LINEAR");
      id_class(10240, "GL11.GL_TEXTURE_MAG_FILTER");
      id_class(10241, "GL11.GL_TEXTURE_MIN_FILTER");
      id_class(10242, "GL11.GL_TEXTURE_WRAP_S");
      id_class(10243, "GL11.GL_TEXTURE_WRAP_T");
      id_class(10496, "GL11.GL_CLAMP");
      id_class(10497, "GL11.GL_REPEAT");
      id_class(-1, "GL11.GL_ALL_CLIENT_ATTRIB_BITS");
      id_class(32824, "GL11.GL_POLYGON_OFFSET_FACTOR");
      id_class(10752, "GL11.GL_POLYGON_OFFSET_UNITS");
      id_class(10753, "GL11.GL_POLYGON_OFFSET_POINT");
      id_class(10754, "GL11.GL_POLYGON_OFFSET_LINE");
      id_class(32823, "GL11.GL_POLYGON_OFFSET_FILL");
      id_class(32827, "GL11.GL_ALPHA4");
      id_class(32828, "GL11.GL_ALPHA8");
      id_class(32829, "GL11.GL_ALPHA12");
      id_class(32830, "GL11.GL_ALPHA16");
      id_class(32831, "GL11.GL_LUMINANCE4");
      id_class(32832, "GL11.GL_LUMINANCE8");
      id_class(32833, "GL11.GL_LUMINANCE12");
      id_class(32834, "GL11.GL_LUMINANCE16");
      id_class(32835, "GL11.GL_LUMINANCE4_ALPHA4");
      id_class(32836, "GL11.GL_LUMINANCE6_ALPHA2");
      id_class(32837, "GL11.GL_LUMINANCE8_ALPHA8");
      id_class(32838, "GL11.GL_LUMINANCE12_ALPHA4");
      id_class(32839, "GL11.GL_LUMINANCE12_ALPHA12");
      id_class(32840, "GL11.GL_LUMINANCE16_ALPHA16");
      id_class(32841, "GL11.GL_INTENSITY");
      id_class(32842, "GL11.GL_INTENSITY4");
      id_class(32843, "GL11.GL_INTENSITY8");
      id_class(32844, "GL11.GL_INTENSITY12");
      id_class(32845, "GL11.GL_INTENSITY16");
      id_class(10768, "GL11.GL_R3_G3_B2");
      id_class(32847, "GL11.GL_RGB4");
      id_class(32848, "GL11.GL_RGB5");
      id_class(32849, "GL11.GL_RGB8");
      id_class(32850, "GL11.GL_RGB10");
      id_class(32851, "GL11.GL_RGB12");
      id_class(32852, "GL11.GL_RGB16");
      id_class(32853, "GL11.GL_RGBA2");
      id_class(32854, "GL11.GL_RGBA4");
      id_class(32855, "GL11.GL_RGB5_A1");
      id_class(32856, "GL11.GL_RGBA8");
      id_class(32857, "GL11.GL_RGB10_A2");
      id_class(32858, "GL11.GL_RGBA12");
      id_class(32859, "GL11.GL_RGBA16");
      id_class(32860, "GL11.GL_TEXTURE_RED_SIZE");
      id_class(32861, "GL11.GL_TEXTURE_GREEN_SIZE");
      id_class(32862, "GL11.GL_TEXTURE_BLUE_SIZE");
      id_class(32863, "GL11.GL_TEXTURE_ALPHA_SIZE");
      id_class(32864, "GL11.GL_TEXTURE_LUMINANCE_SIZE");
      id_class(32865, "GL11.GL_TEXTURE_INTENSITY_SIZE");
      id_class(32867, "GL11.GL_PROXY_TEXTURE_1D");
      id_class(32868, "GL11.GL_PROXY_TEXTURE_2D");
      id_class(32870, "GL11.GL_TEXTURE_PRIORITY");
      id_class(32871, "GL11.GL_TEXTURE_RESIDENT");
      id_class(32872, "GL11.GL_TEXTURE_BINDING_1D");
      id_class(32873, "GL11.GL_TEXTURE_BINDING_2D");
      id_class(32884, "GL11.GL_VERTEX_ARRAY");
      id_class(32885, "GL11.GL_NORMAL_ARRAY");
      id_class(32886, "GL11.GL_COLOR_ARRAY");
      id_class(32887, "GL11.GL_INDEX_ARRAY");
      id_class(32888, "GL11.GL_TEXTURE_COORD_ARRAY");
      id_class(32889, "GL11.GL_EDGE_FLAG_ARRAY");
      id_class(32890, "GL11.GL_VERTEX_ARRAY_SIZE");
      id_class(32891, "GL11.GL_VERTEX_ARRAY_TYPE");
      id_class(32892, "GL11.GL_VERTEX_ARRAY_STRIDE");
      id_class(32894, "GL11.GL_NORMAL_ARRAY_TYPE");
      id_class(32895, "GL11.GL_NORMAL_ARRAY_STRIDE");
      id_class(32897, "GL11.GL_COLOR_ARRAY_SIZE");
      id_class(32898, "GL11.GL_COLOR_ARRAY_TYPE");
      id_class(32899, "GL11.GL_COLOR_ARRAY_STRIDE");
      id_class(32901, "GL11.GL_INDEX_ARRAY_TYPE");
      id_class(32902, "GL11.GL_INDEX_ARRAY_STRIDE");
      id_class(32904, "GL11.GL_TEXTURE_COORD_ARRAY_SIZE");
      id_class(32905, "GL11.GL_TEXTURE_COORD_ARRAY_TYPE");
      id_class(32906, "GL11.GL_TEXTURE_COORD_ARRAY_STRIDE");
      id_class(32908, "GL11.GL_EDGE_FLAG_ARRAY_STRIDE");
      id_class(32910, "GL11.GL_VERTEX_ARRAY_POINTER");
      id_class(32911, "GL11.GL_NORMAL_ARRAY_POINTER");
      id_class(32912, "GL11.GL_COLOR_ARRAY_POINTER");
      id_class(32913, "GL11.GL_INDEX_ARRAY_POINTER");
      id_class(32914, "GL11.GL_TEXTURE_COORD_ARRAY_POINTER");
      id_class(32915, "GL11.GL_EDGE_FLAG_ARRAY_POINTER");
      id_class(10784, "GL11.GL_V2F");
      id_class(10785, "GL11.GL_V3F");
      id_class(10786, "GL11.GL_C4UB_V2F");
      id_class(10787, "GL11.GL_C4UB_V3F");
      id_class(10788, "GL11.GL_C3F_V3F");
      id_class(10789, "GL11.GL_N3F_V3F");
      id_class(10790, "GL11.GL_C4F_N3F_V3F");
      id_class(10791, "GL11.GL_T2F_V3F");
      id_class(10792, "GL11.GL_T4F_V4F");
      id_class(10793, "GL11.GL_T2F_C4UB_V3F");
      id_class(10794, "GL11.GL_T2F_C3F_V3F");
      id_class(10795, "GL11.GL_T2F_N3F_V3F");
      id_class(10796, "GL11.GL_T2F_C4F_N3F_V3F");
      id_class(10797, "GL11.GL_T4F_C4F_N3F_V4F");
      id_class(3057, "GL11.GL_LOGIC_OP");
      id_class(4099, "GL11.GL_TEXTURE_COMPONENTS");
      id_class(32874, "GL12.GL_TEXTURE_BINDING_3D");
      id_class(32875, "GL12.GL_PACK_SKIP_IMAGES");
      id_class(32876, "GL12.GL_PACK_IMAGE_HEIGHT");
      id_class(32877, "GL12.GL_UNPACK_SKIP_IMAGES");
      id_class(32878, "GL12.GL_UNPACK_IMAGE_HEIGHT");
      id_class(32879, "GL12.GL_TEXTURE_3D");
      id_class(32880, "GL12.GL_PROXY_TEXTURE_3D");
      id_class(32881, "GL12.GL_TEXTURE_DEPTH");
      id_class(32882, "GL12.GL_TEXTURE_WRAP_R");
      id_class(32883, "GL12.GL_MAX_3D_TEXTURE_SIZE");
      id_class(32992, "GL12.GL_BGR");
      id_class(32993, "GL12.GL_BGRA");
      id_class(32818, "GL12.GL_UNSIGNED_BYTE_3_3_2");
      id_class(33634, "GL12.GL_UNSIGNED_BYTE_2_3_3_REV");
      id_class(33635, "GL12.GL_UNSIGNED_SHORT_5_6_5");
      id_class(33636, "GL12.GL_UNSIGNED_SHORT_5_6_5_REV");
      id_class(32819, "GL12.GL_UNSIGNED_SHORT_4_4_4_4");
      id_class(33637, "GL12.GL_UNSIGNED_SHORT_4_4_4_4_REV");
      id_class(32820, "GL12.GL_UNSIGNED_SHORT_5_5_5_1");
      id_class(33638, "GL12.GL_UNSIGNED_SHORT_1_5_5_5_REV");
      id_class(32821, "GL12.GL_UNSIGNED_INT_8_8_8_8");
      id_class(33639, "GL12.GL_UNSIGNED_INT_8_8_8_8_REV");
      id_class(32822, "GL12.GL_UNSIGNED_INT_10_10_10_2");
      id_class(33640, "GL12.GL_UNSIGNED_INT_2_10_10_10_REV");
      id_class(32826, "GL12.GL_RESCALE_NORMAL");
      id_class(33272, "GL12.GL_LIGHT_MODEL_COLOR_CONTROL");
      id_class(33273, "GL12.GL_SINGLE_COLOR");
      id_class(33274, "GL12.GL_SEPARATE_SPECULAR_COLOR");
      id_class(33071, "GL12.GL_CLAMP_TO_EDGE");
      id_class(33082, "GL12.GL_TEXTURE_MIN_LOD");
      id_class(33083, "GL12.GL_TEXTURE_MAX_LOD");
      id_class(33084, "GL12.GL_TEXTURE_BASE_LEVEL");
      id_class(33085, "GL12.GL_TEXTURE_MAX_LEVEL");
      id_class(33000, "GL12.GL_MAX_ELEMENTS_VERTICES");
      id_class(33001, "GL12.GL_MAX_ELEMENTS_INDICES");
      id_class(33901, "GL12.GL_ALIASED_POINT_SIZE_RANGE");
      id_class(33902, "GL12.GL_ALIASED_LINE_WIDTH_RANGE");
      id_class(33984, "GL13.GL_TEXTURE0");
      id_class(33985, "GL13.GL_TEXTURE1");
      id_class(33986, "GL13.GL_TEXTURE2");
      id_class(33987, "GL13.GL_TEXTURE3");
      id_class(33988, "GL13.GL_TEXTURE4");
      id_class(33989, "GL13.GL_TEXTURE5");
      id_class(33990, "GL13.GL_TEXTURE6");
      id_class(33991, "GL13.GL_TEXTURE7");
      id_class(33992, "GL13.GL_TEXTURE8");
      id_class(33993, "GL13.GL_TEXTURE9");
      id_class(33994, "GL13.GL_TEXTURE10");
      id_class(33995, "GL13.GL_TEXTURE11");
      id_class(33996, "GL13.GL_TEXTURE12");
      id_class(33997, "GL13.GL_TEXTURE13");
      id_class(33998, "GL13.GL_TEXTURE14");
      id_class(33999, "GL13.GL_TEXTURE15");
      id_class(34000, "GL13.GL_TEXTURE16");
      id_class(34001, "GL13.GL_TEXTURE17");
      id_class(34002, "GL13.GL_TEXTURE18");
      id_class(34003, "GL13.GL_TEXTURE19");
      id_class(34004, "GL13.GL_TEXTURE20");
      id_class(34005, "GL13.GL_TEXTURE21");
      id_class(34006, "GL13.GL_TEXTURE22");
      id_class(34007, "GL13.GL_TEXTURE23");
      id_class(34008, "GL13.GL_TEXTURE24");
      id_class(34009, "GL13.GL_TEXTURE25");
      id_class(34010, "GL13.GL_TEXTURE26");
      id_class(34011, "GL13.GL_TEXTURE27");
      id_class(34012, "GL13.GL_TEXTURE28");
      id_class(34013, "GL13.GL_TEXTURE29");
      id_class(34014, "GL13.GL_TEXTURE30");
      id_class(34015, "GL13.GL_TEXTURE31");
      id_class(34016, "GL13.GL_ACTIVE_TEXTURE");
      id_class(34017, "GL13.GL_CLIENT_ACTIVE_TEXTURE");
      id_class(34018, "GL13.GL_MAX_TEXTURE_UNITS");
      id_class(34065, "GL13.GL_NORMAL_MAP");
      id_class(34066, "GL13.GL_REFLECTION_MAP");
      id_class(34067, "GL13.GL_TEXTURE_CUBE_MAP");
      id_class(34068, "GL13.GL_TEXTURE_BINDING_CUBE_MAP");
      id_class(34069, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_X");
      id_class(34070, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_X");
      id_class(34071, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Y");
      id_class(34072, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Y");
      id_class(34073, "GL13.GL_TEXTURE_CUBE_MAP_POSITIVE_Z");
      id_class(34074, "GL13.GL_TEXTURE_CUBE_MAP_NEGATIVE_Z");
      id_class(34075, "GL13.GL_PROXY_TEXTURE_CUBE_MAP");
      id_class(34076, "GL13.GL_MAX_CUBE_MAP_TEXTURE_SIZE");
      id_class(34025, "GL13.GL_COMPRESSED_ALPHA");
      id_class(34026, "GL13.GL_COMPRESSED_LUMINANCE");
      id_class(34027, "GL13.GL_COMPRESSED_LUMINANCE_ALPHA");
      id_class(34028, "GL13.GL_COMPRESSED_INTENSITY");
      id_class(34029, "GL13.GL_COMPRESSED_RGB");
      id_class(34030, "GL13.GL_COMPRESSED_RGBA");
      id_class(34031, "GL13.GL_TEXTURE_COMPRESSION_HINT");
      id_class(34464, "GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE");
      id_class(34465, "GL13.GL_TEXTURE_COMPRESSED");
      id_class(34466, "GL13.GL_NUM_COMPRESSED_TEXTURE_FORMATS");
      id_class(34467, "GL13.GL_COMPRESSED_TEXTURE_FORMATS");
      id_class(32925, "GL13.GL_MULTISAMPLE");
      id_class(32926, "GL13.GL_SAMPLE_ALPHA_TO_COVERAGE");
      id_class(32927, "GL13.GL_SAMPLE_ALPHA_TO_ONE");
      id_class(32928, "GL13.GL_SAMPLE_COVERAGE");
      id_class(32936, "GL13.GL_SAMPLE_BUFFERS");
      id_class(32937, "GL13.GL_SAMPLES");
      id_class(32938, "GL13.GL_SAMPLE_COVERAGE_VALUE");
      id_class(32939, "GL13.GL_SAMPLE_COVERAGE_INVERT");
      id_class(34019, "GL13.GL_TRANSPOSE_MODELVIEW_MATRIX");
      id_class(34020, "GL13.GL_TRANSPOSE_PROJECTION_MATRIX");
      id_class(34021, "GL13.GL_TRANSPOSE_TEXTURE_MATRIX");
      id_class(34022, "GL13.GL_TRANSPOSE_COLOR_MATRIX");
      id_class(34160, "GL13.GL_COMBINE");
      id_class(34161, "GL13.GL_COMBINE_RGB");
      id_class(34162, "GL13.GL_COMBINE_ALPHA");
      id_class(34176, "GL13.GL_SOURCE0_RGB");
      id_class(34177, "GL13.GL_SOURCE1_RGB");
      id_class(34178, "GL13.GL_SOURCE2_RGB");
      id_class(34184, "GL13.GL_SOURCE0_ALPHA");
      id_class(34185, "GL13.GL_SOURCE1_ALPHA");
      id_class(34186, "GL13.GL_SOURCE2_ALPHA");
      id_class(34192, "GL13.GL_OPERAND0_RGB");
      id_class(34193, "GL13.GL_OPERAND1_RGB");
      id_class(34194, "GL13.GL_OPERAND2_RGB");
      id_class(34200, "GL13.GL_OPERAND0_ALPHA");
      id_class(34201, "GL13.GL_OPERAND1_ALPHA");
      id_class(34202, "GL13.GL_OPERAND2_ALPHA");
      id_class(34163, "GL13.GL_RGB_SCALE");
      id_class(34164, "GL13.GL_ADD_SIGNED");
      id_class(34165, "GL13.GL_INTERPOLATE");
      id_class(34023, "GL13.GL_SUBTRACT");
      id_class(34166, "GL13.GL_CONSTANT");
      id_class(34167, "GL13.GL_PRIMARY_COLOR");
      id_class(34168, "GL13.GL_PREVIOUS");
      id_class(34478, "GL13.GL_DOT3_RGB");
      id_class(34479, "GL13.GL_DOT3_RGBA");
      id_class(33069, "GL13.GL_CLAMP_TO_BORDER");
      id_class(33169, "GL14.GL_GENERATE_MIPMAP");
      id_class(33170, "GL14.GL_GENERATE_MIPMAP_HINT");
      id_class(33189, "GL14.GL_DEPTH_COMPONENT16");
      id_class(33190, "GL14.GL_DEPTH_COMPONENT24");
      id_class(33191, "GL14.GL_DEPTH_COMPONENT32");
      id_class(34890, "GL14.GL_TEXTURE_DEPTH_SIZE");
      id_class(34891, "GL14.GL_DEPTH_TEXTURE_MODE");
      id_class(34892, "GL14.GL_TEXTURE_COMPARE_MODE");
      id_class(34893, "GL14.GL_TEXTURE_COMPARE_FUNC");
      id_class(34894, "GL14.GL_COMPARE_R_TO_TEXTURE");
      id_class(33872, "GL14.GL_FOG_COORDINATE_SOURCE");
      id_class(33873, "GL14.GL_FOG_COORDINATE");
      id_class(33874, "GL14.GL_FRAGMENT_DEPTH");
      id_class(33875, "GL14.GL_CURRENT_FOG_COORDINATE");
      id_class(33876, "GL14.GL_FOG_COORDINATE_ARRAY_TYPE");
      id_class(33877, "GL14.GL_FOG_COORDINATE_ARRAY_STRIDE");
      id_class(33878, "GL14.GL_FOG_COORDINATE_ARRAY_POINTER");
      id_class(33879, "GL14.GL_FOG_COORDINATE_ARRAY");
      id_class(33062, "GL14.GL_POINT_SIZE_MIN");
      id_class(33063, "GL14.GL_POINT_SIZE_MAX");
      id_class(33064, "GL14.GL_POINT_FADE_THRESHOLD_SIZE");
      id_class(33065, "GL14.GL_POINT_DISTANCE_ATTENUATION");
      id_class(33880, "GL14.GL_COLOR_SUM");
      id_class(33881, "GL14.GL_CURRENT_SECONDARY_COLOR");
      id_class(33882, "GL14.GL_SECONDARY_COLOR_ARRAY_SIZE");
      id_class(33883, "GL14.GL_SECONDARY_COLOR_ARRAY_TYPE");
      id_class(33884, "GL14.GL_SECONDARY_COLOR_ARRAY_STRIDE");
      id_class(33885, "GL14.GL_SECONDARY_COLOR_ARRAY_POINTER");
      id_class(33886, "GL14.GL_SECONDARY_COLOR_ARRAY");
      id_class(32968, "GL14.GL_BLEND_DST_RGB");
      id_class(32969, "GL14.GL_BLEND_SRC_RGB");
      id_class(32970, "GL14.GL_BLEND_DST_ALPHA");
      id_class(32971, "GL14.GL_BLEND_SRC_ALPHA");
      id_class(34055, "GL14.GL_INCR_WRAP");
      id_class(34056, "GL14.GL_DECR_WRAP");
      id_class(34048, "GL14.GL_TEXTURE_FILTER_CONTROL");
      id_class(34049, "GL14.GL_TEXTURE_LOD_BIAS");
      id_class(34045, "GL14.GL_MAX_TEXTURE_LOD_BIAS");
      id_class(33648, "GL14.GL_MIRRORED_REPEAT");
      id_class(32773, "ARBImaging.GL_BLEND_COLOR");
      id_class(32777, "ARBImaging.GL_BLEND_EQUATION");
      id_class(32774, "GL14.GL_FUNC_ADD");
      id_class(32778, "GL14.GL_FUNC_SUBTRACT");
      id_class(32779, "GL14.GL_FUNC_REVERSE_SUBTRACT");
      id_class(32775, "GL14.GL_MIN");
      id_class(32776, "GL14.GL_MAX");
      id_class(34962, "GL15.GL_ARRAY_BUFFER");
      id_class(34963, "GL15.GL_ELEMENT_ARRAY_BUFFER");
      id_class(34964, "GL15.GL_ARRAY_BUFFER_BINDING");
      id_class(34965, "GL15.GL_ELEMENT_ARRAY_BUFFER_BINDING");
      id_class(34966, "GL15.GL_VERTEX_ARRAY_BUFFER_BINDING");
      id_class(34967, "GL15.GL_NORMAL_ARRAY_BUFFER_BINDING");
      id_class(34968, "GL15.GL_COLOR_ARRAY_BUFFER_BINDING");
      id_class(34969, "GL15.GL_INDEX_ARRAY_BUFFER_BINDING");
      id_class(34970, "GL15.GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING");
      id_class(34971, "GL15.GL_EDGE_FLAG_ARRAY_BUFFER_BINDING");
      id_class(34972, "GL15.GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING");
      id_class(34973, "GL15.GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING");
      id_class(34974, "GL15.GL_WEIGHT_ARRAY_BUFFER_BINDING");
      id_class(34975, "GL15.GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING");
      id_class(35040, "GL15.GL_STREAM_DRAW");
      id_class(35041, "GL15.GL_STREAM_READ");
      id_class(35042, "GL15.GL_STREAM_COPY");
      id_class(35044, "GL15.GL_STATIC_DRAW");
      id_class(35045, "GL15.GL_STATIC_READ");
      id_class(35046, "GL15.GL_STATIC_COPY");
      id_class(35048, "GL15.GL_DYNAMIC_DRAW");
      id_class(35049, "GL15.GL_DYNAMIC_READ");
      id_class(35050, "GL15.GL_DYNAMIC_COPY");
      id_class(35000, "GL15.GL_READ_ONLY");
      id_class(35001, "GL15.GL_WRITE_ONLY");
      id_class(35002, "GL15.GL_READ_WRITE");
      id_class(34660, "GL15.GL_BUFFER_SIZE");
      id_class(34661, "GL15.GL_BUFFER_USAGE");
      id_class(35003, "GL15.GL_BUFFER_ACCESS");
      id_class(35004, "GL15.GL_BUFFER_MAPPED");
      id_class(35005, "GL15.GL_BUFFER_MAP_POINTER");
      id_class(34138, "NVFogDistance.GL_FOG_DISTANCE_MODE_NV");
      id_class(34139, "NVFogDistance.GL_EYE_RADIAL_NV");
      id_class(34140, "NVFogDistance.GL_EYE_PLANE_ABSOLUTE_NV");
   }

   public static void id_class(int var0, boolean var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      if (var0 > 0) {
         GLCapabilities var2 = org.lwjgl.opengl.GL.getCapabilities();
         if (var2.GL_KHR_debug) {
            GL11.glEnable(37600);
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int var3 = 0; var3 < id_private.size(); var3++) {
               boolean var4 = var3 < var0;
               KHRDebug.glDebugMessageControl(4352, 4352, id_private.get(var3), (int[])null, var4);
            }

            KHRDebug.glDebugMessageCallback(GLX.make(GLDebugMessageCallback.create(HX::id_class), gs_3::id_class), 0L);
         } else if (var2.GL_ARB_debug_output) {
            if (var1) {
               GL11.glEnable(33346);
            }

            for (int var5 = 0; var5 < id_implements.size(); var5++) {
               boolean var6 = var5 < var0;
               ARBDebugOutput.glDebugMessageControlARB(4352, 4352, id_implements.get(var5), (int[])null, var6);
            }

            ARBDebugOutput.glDebugMessageCallbackARB(GLX.make(GLDebugMessageARBCallback.create(HX::id_class), gs_3::id_class), 0L);
         }
      }
   }

   private static void id_class(int var0, int var1, int var2, int var3, int var4, long var5, long var7) {
      if (var1 != 33385 && var1 != 33386 && !rrki_1.id_class(id_extends, var2) && (!rrbb_3.rs() || var0 != 33352)) {
         QY var9 = QY.id_instanceof();
         if ((var9 == null || var9.id_else() == null || !var9.id_else().id_goto()) && rrbo_3.id_class(var2)) {
            String var10 = id_break(var0);
            String var11 = id_byte(var1);
            String var12 = id_protected(var3);
            String var13 = GLDebugMessageCallback.getMessage(var4, var5);
            var13 = rrzX_2.id_private(var13, " \n\r\t");
            String var14 = String.format("OpenGL %s %s: %s (%s)", var10, var11, var2, var13);
            Exception var15 = new Exception("Stack trace");
            StackTraceElement[] var16 = var15.getStackTrace();
            StackTraceElement[] var17 = var16.length > 2 ? Arrays.copyOfRange(var16, 2, var16.length) : var16;
            var15.setStackTrace(var17);
            if (var1 == 33356) {
               id_protected.error(var14, var15);
            } else {
               id_protected.info(var14, var15);
            }

            if (rrbb_3.rT() && rrzQ_2.id_class("ShowGlErrorDebug", 10000L)) {
               String var18 = rrbb_3.id_byte(var2);
               if (var2 == 0 || rrbb_3.id_class((Object)var18, (Object)"Unknown")) {
                  var18 = var13;
               }

               String var19 = jI_2.id_class("of.message.openglError", var2, var18);
               ((cq_3)QY.id_instanceof().id_class[19]).id_throws().id_class(new rgN_2(var19));
            }
         }
      }
   }

   private static int[] id_class() {
      String var0 = System.getProperty("gl.ignore.errors");
      if (var0 == null) {
         return new int[0];
      } else {
         String[] var1 = rrbb_3.id_class(var0, ",");
         int[] var2 = new int[0];

         for (int var3 = 0; var3 < var1.length; var3++) {
            String var4 = var1[var3].trim();
            int var5 = var4.startsWith("0x") ? rrbb_3.id_break(var4, -1) : rrbb_3.id_class(var4, -1);
            if (var5 < 0) {
               rrbb_3.id_protected("Invalid error id: " + var4);
            } else {
               rrbb_3.id_case("Ignore OpenGL error: " + var5);
               var2 = rrki_1.id_break(var2, var5);
            }
         }

         return var2;
      }
   }

   private static String id_class(int var0) {
      return "Unknown (0x" + Integer.toHexString(var0).toUpperCase() + ")";
   }

   private static void id_class(int var0, String var1) {
      id_catch.merge(var0, var1, (var0x, var1x) -> var0x + "/" + var1x);
   }

   private static String id_break(int var0) {
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
            return id_class(var0);
      }
   }

   private static String id_protected(int var0) {
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
            return id_class(var0);
      }
   }
}
