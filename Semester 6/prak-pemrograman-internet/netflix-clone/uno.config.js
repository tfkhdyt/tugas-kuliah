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
					{
						name: 'sans-serif',
						provider: 'none',
					},
				],
				volkhov: [
					{
						name: 'Volkhov',
						weights: ['700'],
					},
					{
						name: 'serif',
						provider: 'none',
					},
				],
			},
		}),
	],
});
