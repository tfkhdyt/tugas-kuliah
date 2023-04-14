import { defineConfig, presetAttributify, presetUno, presetWebFonts } from 'unocss';

export default defineConfig({
	presets: [
		presetUno(),
		presetAttributify(),
		presetWebFonts({
			provider: 'google',
			fonts: {
				montserrat: [
					{
						name: 'Montserrat',
						weights: ['400', '500', '600', '700'],
					},
				],
			},
		}),
	],
});
